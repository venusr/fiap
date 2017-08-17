<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Aluno</title>
</head>
<body>
    <s:form action="/cadastrarAluno" namespace="/aluno" method="post" enctype="multipart/form-data">
      <s:textfield name="aluno.nome" label="Nome" />
      <s:textfield name="aluno.rg" label="RG" />
      <sx:datetimepicker name="aluno.dataNasc" label="Data de Nasc." displayFormat="dd-MMM-yyyy" value="%('2010-01-01')" />
      <s:textfield name="aluno.email" label="Email" />
      <s:submit />
   </s:form>
</body>
</html>