<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true" %> <%-- XML태그 시작 전에 공백 제거 --%>

<%--DB 연동 =>만약에 user_id=hong이라면 이미 DB에 저장된 ID로 취급(TRUE) --%>
<c:set var ="result" value ="false"/>
<c:if test="${param.user_id == 'hong' }">
	<c:set var ="result" value="true"/>
</c:if>

<%--XML로 보내기 --%>
<?xml version="1.0" encoding="UTF-8"?>
<check_id>
	<result>${result}</result>
</check_id>
