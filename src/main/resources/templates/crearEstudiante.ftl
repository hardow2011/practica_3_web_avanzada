<#include "navbar.ftl">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${accion} estudiante</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
    <@navbar/>
    <div class="container">
        <div class="jumbotron">
            <h1 class="display-4 text-center">${accion} estudiante</h1>
        </div>
        <form enctype="application/x-www-form-urlencoded" action=${direccionPost} method="post">
            <div class="form-group">
                <label for="inputMatricula">Matrícula</label>
                <input type="text" class="form-control" id="inputMatricula" name="matricula" placeholder="Digite la matrícula">
            </div>
            <div class="form-group">
                <label for="inputNombre">Nombre</label>
                <input type="text" class="form-control" id="inputNombre" name="nombre" placeholder="Digite el nombre">
            </div>
            <div class="form-group">
                <label for="inputTelefono">Teléfono</label>
                <input type="text" class="form-control" id="inputTelefono" name="telefono" placeholder="Digite el teléfono">
            </div>
            <button id="btnSubmitEstudiante" type="submit" class="btn btn-primary float-right">Confirmar</button>
        </form>
    </div>
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>