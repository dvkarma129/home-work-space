package com.decodetech.demo.service;

import java.io.*;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.decodetech.demo.dto.StudentDTO;
import com.decodetech.demo.dto.TeacherDTO;
import com.decodetech.demo.repository.StudentRepo;
import com.decodetech.demo.repository.TeacherRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class WorkbookGenerator {

	private final StudentRepo studentRepo;

	private final TeacherRepo teacherRepo;

	public void generateWorkbook() throws IOException {
		Workbook wb = new HSSFWorkbook();
		OutputStream fileOut = new FileOutputStream("E:\\Java\\New folder (2)\\Student.xls");
		System.out.println("Excel File has been created successfully.");
		wb.write(fileOut);
	}

	public void downloadData() {
		try {
			String filename = "E:\\Java\\New folder (2)\\Data.xls";

			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Student Data");
			HSSFSheet sheet1 = workbook.createSheet("Teacher Data");

			HSSFRow rowhead = sheet.createRow((short) 0);
			HSSFRow rowhead1 = sheet1.createRow((short) 0);

			// creating header for student data sheet
			rowhead.createCell(0).setCellValue("STUDENT ID");
			rowhead.createCell(1).setCellValue("STUDENT FIRST NAME");
			rowhead.createCell(2).setCellValue("STUDENT LAST FNAME");
			rowhead.createCell(3).setCellValue("STUDENT AGE");
			rowhead.createCell(4).setCellValue("STUDENT GENDER");
			rowhead.createCell(5).setCellValue("STUDENT ADDRESS");
			rowhead.createCell(6).setCellValue("STUDENT USERNAME");
			rowhead.createCell(7).setCellValue("STUDENT PASSWORD");

			// creating header for teacher data sheet
			rowhead1.createCell(0).setCellValue("TEACHER ID");
			rowhead1.createCell(1).setCellValue("TEACHER NAME");
			rowhead1.createCell(2).setCellValue("TEACHER AGE");

			// inserting student data in student data sheet
			List<StudentDTO> dto = studentRepo.findAll();
			int i = 1;
			for (StudentDTO stddto : dto) {
				HSSFRow row = sheet.createRow((short) i++);
				row.createCell(0).setCellValue(stddto.getStudentId());
				row.createCell(1).setCellValue(stddto.getStudentFname());
				row.createCell(2).setCellValue(stddto.getStudentLname());
				row.createCell(3).setCellValue(stddto.getStudentAge());
				row.createCell(4).setCellValue(stddto.getStudentGender());
				row.createCell(5).setCellValue(stddto.getStudentAddress());
				row.createCell(6).setCellValue(stddto.getStudentUsername());
				row.createCell(7).setCellValue(stddto.getStudentPassword());
			}

			// inserting teacher data in teacher data sheet
			List<TeacherDTO> teacherDto = teacherRepo.findAll();
			int j = 1;
			for (TeacherDTO teadto : teacherDto) {
				HSSFRow row = sheet1.createRow((short) j++);
				row.createCell(0).setCellValue(teadto.getTeacherId());
				row.createCell(1).setCellValue(teadto.getTeacherName());
				row.createCell(2).setCellValue(teadto.getTeacherAge());
			}

			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			fileOut.close();
			workbook.close();

			System.out.println("Excel file has been generated successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertWorkbookData(MultipartFile file) {

		try {
//			File file = new File("E:\\Java\\New folder (2)\\DataStd.xls"); // creating a new file instance
//			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file
			// creating Workbook instance that refers to .xlsx file
			HSSFWorkbook wb = new HSSFWorkbook(file.getInputStream());
			HSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object
			Iterator<Row> itr = sheet.iterator(); // iterating over excel file

			itr.next(); // skip the header row
			while (itr.hasNext()) {
				Row nextRow = itr.next();
				Iterator<Cell> cellIterator = nextRow.cellIterator();

				StudentDTO dto = new StudentDTO();
				while (cellIterator.hasNext()) {
					
					Cell nextCell = cellIterator.next();
					int columnIndex = nextCell.getColumnIndex();
					switch (columnIndex) {
					case 0:
						dto.setStudentFname(nextCell.getStringCellValue());
						break;
					case 1:
						dto.setStudentLname(nextCell.getStringCellValue());
						break;
					case 2:
						dto.setStudentAge((int) nextCell.getNumericCellValue());
						break;
					case 3:
						dto.setStudentGender(nextCell.getStringCellValue());
						break;
					case 4:
						dto.setStudentAddress(nextCell.getStringCellValue());
						break;
					case 5:
						dto.setStudentUsername(nextCell.getStringCellValue());
						break;
					case 6:
						dto.setStudentPassword(nextCell.getStringCellValue());
						break;
					}
				}
				studentRepo.save(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
