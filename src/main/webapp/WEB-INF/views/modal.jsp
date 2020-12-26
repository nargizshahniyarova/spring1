<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form method="post" action="save">
    <label for="id2" >Pan</label><input name="id" id="id2" type="hidden" value="${cardDto.id}" class="form-control">
    <label for="pan2">Pan</label><input  name="pan" id="pan2" type="text" value="${cardDto.pan}" class="form-control">
    <label for="mba2">MBA</label><input  name="mba" id="mba2" type="text" value="${cardDto.mba}" class="form-control">
    <label for="uid2">UID</label><input id="uid2"  name="uid" type="text" value="${cardDto.uid}" class="form-control">
    <label for="account2">account</label><input id="account2" name="account" value="${cardDto.account}" type="text" class="form-control">
    <label for="currency2">currency</label><input  id="currency2" name="currency" value="${cardDto.currency}" type="text" class="form-control datepicker">

    <input type="submit" class="btn-primary" value="Melumati elave et">
    <span id="showInfo2"></span>
</form>