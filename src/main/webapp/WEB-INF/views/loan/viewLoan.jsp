<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

    <title>View Loan</title>
</head>
<body>
    <h1>Loan Details</h1>
    <p>Loan num: ${loan.Loan_num}</p>
    <p>borrower: ${loan.borrower}</p>
    <p>customerId: ${loan.customerId}</p>
    <p>Account ID: ${loan.accountId}</p>
    <p>Amount: ${loan.amount}</p>
    <p>Start Date: ${loan.startDate}</p>
    <p>End Date: ${loan.endDate}</p>
    <p>Interest Rate: ${loan.interestRate}</p>
    <p>Repayment_status: ${loan.Repayment_status}</p>
    <a href="${ pageContext.request.contextPath }/loan/apply">Apply for a new loan</a>
</body>
</html>
