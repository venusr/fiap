<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="aluno" class="fiap.scj.AlunoBean" scope="page">
   <jsp:setProperty name="aluno" property="nome" param="nome" />
   <jsp:setProperty name="aluno" property="email" param="email" />
   <jsp:setProperty name="aluno" property="telefone" param="telefone" />
</jsp:useBean>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   Olá <jsp:getProperty name="aluno" property="nome" /><body>
   Seu email: <jsp:getProperty name="aluno" property="email" />
   Telefone: ${aluno.telefone}
</body>
</body>
</html>

