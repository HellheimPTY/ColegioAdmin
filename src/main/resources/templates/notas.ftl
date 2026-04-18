<#import "home.ftl" as base>

<@base.layout>
    <h2 class="text-xl font-bold mb-4">Gestión de Notas</h2>
    <a class="bg-blue-600 text-white px-4 py-2 rounded mb-3 inline-block" href="/notas/nueva">Agregar Nota</a>
    <table class="table-auto w-full border-collapse border border-gray-300">
        <thead class="bg-gray-200">
            <tr>
                <th class="border px-2 py-1">Materia</th>
                <th class="border px-2 py-1">Calificación</th>
                <th class="border px-2 py-1">Estudiante</th>
                <th class="border px-2 py-1">Acciones</th>
            </tr>
        </thead>
        <tbody>
            <#list notas as n>
                <tr>
                    <td class="border px-2 py-1">${n.materia}</td>
                    <td class="border px-2 py-1">${n.calificacion}</td>
                    <td class="border px-2 py-1">${n.estudiante.nombres}</td>
                    <td class="border px-2 py-1">
                        <a class="bg-yellow-500 text-white px-2 py-1 rounded" href="/notas/editar/${n.id}">Editar</a>
                        <a class="bg-red-600 text-white px-2 py-1 rounded" href="/notas/eliminar/${n.id}">Eliminar</a>
                    </td>
                </tr>
            </#list>
        </tbody>
    </table>
</@base.layout>
