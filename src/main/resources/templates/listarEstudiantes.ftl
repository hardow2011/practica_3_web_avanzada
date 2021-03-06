<#include "navbar.ftl">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${accion} estudiantes</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/mystyle.css">
</head>
<body>
    <@navbar/>
    <div class="container">
        <div class="jumbotron">
            <h1 class="display-4 text-center">${accion} estudiantes</h1>
        </div>
            <a href="/estudiantes/crear" class="btn btn-success float-right">Nuevo estudiante</a>
        <div class="table-responsive">
            <table class="table table-stripped">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Matrícula</th>
                        <th>Nombre</th>
                        <th>Teléfono</th>
                        <th>Acción</th>
                    </tr>
                </thead>
                <tbody>
                    <#foreach estudiante in listaEstudiantes>
                        <tr>
                            <td>${estudiante.id}</td>
                            <td>${estudiante.matricula}</td>
                            <td>${estudiante.nombre}</td>
                            <td>${estudiante.telefono}</td>
                            <td>
                                <a class="btn btn-primary" href="/estudiantes/editar/${estudiante.id}">Editar</a> |
                                <a class="btn btn-info" href="/estudiantes/visualizar/${estudiante.id}">Visualizar</a> |
                                <a class="btn btn-danger" href="/estudiantes/eliminar/${estudiante.id}">Eliminar</a>
                            </td>
                        </tr>
                    </#foreach>
                </tbody>
            </table>
        </div>
    </div>
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>