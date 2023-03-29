<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ruslan</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="header">
    <h1>ePharmacy</h1>
</div>

<div class="button-container">
    <a href="cs?action=getDepartmentList"><input type="button" class="button department-btn" value="Department" id="departmentDataBtnId"></a>
    <a href="cs?action=getMedicationsList"><input type="button" class="button medications-btn" value="Medications" id="medicationsDataBtnId"></a>
    <a href="cs?action=getPatientsList"><input type="button" class="button patients-btn" value="Patients" id="patientsDataBtnId"></a>
    <a href="cs?action=getPrescriptionsList"><input type="button" class="button prescriptions-btn" value="Prescriptions" id="prescriptionsDataBtnId"></a>
    <a href="cs?action=getPaymentsList"><input type="button" class="button payments-btn" value="Payments" id="paymentsDataBtnId"></a>
    <a href="cs?action=getInventoryList"><input type="button" class="button inventory-btn" value="Inventory" id="inventoryDataBtnId"></a>
    <a href="cs?action=getJobsList"><input type="button" class="button jobs-btn" value="Jobs" id="jobsDataBtnId"></a>
    <a href="cs?action=getOrdersList"><input type="button" class="button orders-btn" value="Orders" id="ordersDataBtnId"></a>
    <a href="cs?action=getEmployeesList"><input type="button" class="button employees-btn" value="Employees" id="employeesDataBtnId"></a>
    <a href="cs?action=getViewList"><input type="button" class="button view-btn" value="View" id="viewDataBtnId"></a>
</div>

</body>
</html>