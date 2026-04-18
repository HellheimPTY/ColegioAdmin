<#import "home.ftl" as base>

<@base.layout>
    <h2 class="text-xl font-bold mb-4">Formulario de Estudiante</h2>
    <form action="/estudiantes/guardar" method="post" class="space-y-4">
        <!-- Campo oculto para edición (no visible al usuario) -->
        <#if estudiante.id??>
            <input type="hidden" name="id" value="${estudiante.id}"/>
        </#if>

        <div>
            <label class="block text-gray-700">Nombres</label>
            <input type="text" name="nombres" value="${estudiante.nombres!}"
                   class="w-full border rounded px-3 py-2"/>
        </div>

        <div>
            <label class="block text-gray-700">Apellidos</label>
            <input type="text" name="apellidos" value="${estudiante.apellidos!}"
                   class="w-full border rounded px-3 py-2"/>
        </div>

        <div>
            <label class="block text-gray-700">Grado</label>
            <input type="text" name="grado" value="${estudiante.grado!}"
                   class="w-full border rounded px-3 py-2"/>
        </div>

        <div>
            <label class="block text-gray-700">Edad</label>
            <input type="number" name="edad" value="${estudiante.edad!}"
                   class="w-full border rounded px-3 py-2"/>
        </div>

        <div>
            <label class="block text-gray-700">Género</label>
            <select name="genero" class="w-full border rounded px-3 py-2">
                <option value="Masculino" <#if estudiante.genero?? && estudiante.genero == "Masculino">selected</#if>>Masculino</option>
                <option value="Femenino" <#if estudiante.genero?? && estudiante.genero == "Femenino">selected</#if>>Femenino</option>
                <option value="Otro" <#if estudiante.genero?? && estudiante.genero == "Otro">selected</#if>>Otro</option>
            </select>
        </div>

        <div>
            <label class="block text-gray-700">Teléfono</label>
            <input type="text" name="telefono" value="${estudiante.telefono!}"
                   class="w-full border rounded px-3 py-2"/>
        </div>

        <button type="submit" class="bg-green-600 text-white px-4 py-2 rounded">Guardar</button>
        <a href="/estudiantes" class="bg-gray-500 text-white px-4 py-2 rounded">Cancelar</a>
    </form>
</@base.layout>
