<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true" %> <%-- XML태그 시작 전에 공백 제거 --%>

<%-- DB연동 =>아이디 "hong", 비밀번호: "111"이면 로그인 성공으로 취급--%>
<c:set var ="result" value="true"/>
<c:set var ="message" value="홍길동님이 로그인하였습니다."/>

<c:if test ="${param.user_id != 'hong' }">
	<c:set var = "result" value =" false"/>
	<c:set var ="message" value="가입되지 않은 아이디 입니다."/>
</c:if>

<c:if test ="${param.user_password != '111' }">
	<c:set var = "result" value =" false"/>
	<c:set var ="message" value="비밀번호가 맞지 않습니다."/>
</c:if>

<%--XML로 보내기 --%>
<?xml version="1.0" encoding="UTF-8"?>
<login>
	<result>${result }</result>
	<message>${message }</message>
</login>

