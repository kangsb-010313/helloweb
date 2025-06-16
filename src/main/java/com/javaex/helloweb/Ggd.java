package com.javaex.helloweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ggd")
public class Ggd extends HttpServlet {
	
	//필드
	private static final long serialVersionUID = 1L;
	
       
	//생성자

    
    //메소드 gs - X

	
    //메소드 일반
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//java 기본 문법에 html을 추가로 표현
		//java <-- html
		System.out.println("doGet()실행"); //콘솔
		int dan = Integer.parseInt(request.getParameter("dan"));
		System.out.println(dan);
		
		PrintWriter writer = response.getWriter(); //응답문서에 추가
		writer.println("<table border= '1'>");
		writer.println("	<tbody>");
		
		for(int i=1; i<=9; i++) {
			writer.println("		<tr>");
			writer.println("			<td>" + dan + "</td><td>" + i + "</td><td>"+ dan*i + "</td>");
			writer.println("		</tr>");	
		}
		
		writer.println("	</tbody>");
		writer.println("</table>");

		//writer.println("");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
	}

}
