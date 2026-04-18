<#macro layout>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Colegio Admin</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100">
<div class="flex">
    <!-- Sidebar -->
    <div class="bg-gray-900 text-white p-4 w-56 min-h-screen">
        <h4 class="text-lg font-bold">Colegio Admin</h4>
        <ul class="mt-6 space-y-2">
            <li><a class="block hover:bg-gray-700 p-2 rounded" href="/estudiantes">Estudiantes</a></li>
            <li><a class="block hover:bg-gray-700 p-2 rounded" href="/notas">Notas</a></li>
        </ul>
    </div>

    <!-- Main content -->
    <div class="flex-grow p-6">
        <#nested> <!-- Aquí se inserta el contenido -->
    </div>
</div>
</body>
</html>
</#macro>
