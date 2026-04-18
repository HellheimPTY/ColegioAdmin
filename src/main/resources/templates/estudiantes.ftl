<#import "home.ftl" as base>

<@base.layout>
    <h2 class="text-xl font-bold mb-4">Gestión de Estudiantes</h2>
    <a class="bg-blue-600 text-white px-4 py-2 rounded mb-3 inline-block" href="/estudiantes/nuevo">Agregar Estudiante</a>
    <table class="table-auto w-full border-collapse border border-gray-300">
        <thead class="bg-gray-200">
            <tr>
                <th class="border px-2 py-1">Nombres</th>
                <th class="border px-2 py-1">Apellidos</th>
                <th class="border px-2 py-1">Acciones</th>
            </tr>
        </thead>
        <tbody>
            <#list estudiantes as e>
                <tr>
                    <td class="border px-2 py-1">${e.nombres}</td>
                    <td class="border px-2 py-1">${e.apellidos}</td>
                    <td class="border px-2 py-1">
                        <a class="bg-yellow-500 text-white px-2 py-1 rounded" href="/estudiantes/editar/${e.id}">Editar</a>
                        <a class="bg-red-600 text-white px-2 py-1 rounded" href="/estudiantes/eliminar/${e.id}">Eliminar</a>
                    </td>
                </tr>
            </#list>
        </tbody>
    </table>
</@base.layout>
