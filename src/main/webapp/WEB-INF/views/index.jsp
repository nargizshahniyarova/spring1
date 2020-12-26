<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<header>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/dataTables.bootstrap.css">

    <script src="resources/js/jquery-3.4.1.min.js"></script>
    <script src="resources/js/jquery-ui.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/jquery.dataTables.js"></script>
    <script src="resources/js/dataTables.bootstrap.js"></script>
</header>
<body>
<h2>${index}</h2>
<%--<form action="save" method="post">
    Pan:<input type="text" name="pan"></br>
    MBR:<input type="text" name="mba"></br>
    UID:<input type="text" name="uid"></br>
    account:<input type="text" name="account"></br>
    Currency:<input type="number" name="currency"></br>
<input type="submit" value="add card info">

</form>--%>

<table id="custId" class="table table-striped table-bordered" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>id</th>
        <th>Pan</th>
        <th>MBR</th>
        <th>UID</th>
        <th>account</th>
        <th>Currency</th>
        <th>Delete</th>
        <th>Update</th>
    </tr>
    </thead>

    <tfoot>
    <tr>
        <th>id</th>
        <th>Pan</th>
        <th>MBR</th>
        <th>UID</th>
        <th>account</th>
        <th>Currency</th>
        <th>Delete</th>
        <th>Update</th>
    </tr>
    </tfoot>
    <tbody>
    <c:forEach items="${cardDtos}" var="cardDto">
        <tr>
            <td>${cardDto.id}</td>
            <td>${cardDto.pan}</td>
            <td>${cardDto.mba}</td>
            <td>${cardDto.uid}</td>
            <td>${cardDto.account}</td>
            <td>${cardDto.currency}</td>
            <td><a style="color: red" href="${cardDto.id}">Melumatin silinmesi</a></td>
            <td><a style="color: green" onclick="return onclickFunction(${cardDto.id})">Melumatin redaktesi</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button id="addCardInfo" style="border: #2b542c" >Melumatin elave olunmasi</button>
<div class="modal fade" id="addPersonModal" role="dialog">
    <div class="modal-dialog">      <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Person add</h4>
            </div>

            <div class="modal-body">
                <form method="post" action="save">
                    <label for="pan">Pan</label><input  name="pan" id="pan" type="text" class="form-control">
                    <label for="mba">MBA</label><input  name="mba" id="mba" type="text" class="form-control">
                    <label for="uid">UID</label><input id="uid"  name="uid" type="text" class="form-control">
                    <label for="account">account</label><input id="account" name="account" type="text" class="form-control">
                    <label for="currency">currency</label><input  id="currency" name="currency" type="text" class="form-control datepicker">

                    <input type="submit" class="btn-primary" value="Melumati elave et">
                    <span id="showInfo"></span>
                </form>

            </div>

            <div class="modal-footer">
                <%--<button type="button" id="addPersonBtn" class="btn btn-primary" >Add</button>--%>
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="updatePersonModal" role="dialog">
    <div class="modal-dialog">      <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Person add</h4>
            </div>

            <div class="modal-body" id="modalBody">


            </div>

            <div class="modal-footer">
                <%--<button type="button" id="addPersonBtn" class="btn btn-primary" >Add</button>--%>
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<%--<table>
    <tr>
      <td>Pan</td>
      <td>MBR</td>
      <td>UID</td>
      <td>account</td>
      <td>Currency</td>
    </tr>
    <tr>
        <td>${cardDto.pan}</td>
        <td>${cardDto.mba}</td>
        <td>${cardDto.uid}</td>
        <td>${cardDto.account}</td>
        <td>${cardDto.currency}</td>
    </tr>
</table>--%>
</body>
<script>
    $(function () {
        $('#custId').dataTable();
        $('#addCardInfo').click(function () {
            $('#addPersonModal').modal('show');
        });


    });
    function  onclickFunction(pId){
        alert(pId);
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/getData/"+ pId,
            //contentType: "application/json",
            dataType: "html",
            success: function (data){
                alert("data="+data);
                $('#modalBody').html(data);
               // var obj = JSON.parse(data);
                $('#updatePersonModal').modal('show');
              //  alert("test"+obj.getAttribute('id')+"test"+obj.getAttribute('pan'));
            },
            error: function (xhr, ajaxOptions, thrownError){

            }
        });
        return false;
    }
</script>
</html>
