<#import "home.ftl" as base>

<@base.layout>
    <h2 class="text-xl font-bold mb-4">Formulario de Nota</h2>
    <form action="/notas/guardar" method="post" class="space-y-4">
        <!-- Campo oculto para edición -->
        <#if nota.idNota??>
            <input type="hidden" name="idNota" value="${nota.idNota}"/>
        </#if>

        <div>
            <label class="block text-gray-700">Asignatura</label>
            <select name="asignatura" class="w-full border rounded px-3 py-2">
                <option value="Matemáticas" <#if nota.asignatura?? && nota.asignatura == "Matemáticas">selected</#if>>Matemáticas</option>
                <option value="Español" <#if nota.asignatura?? && nota.asignatura == "Español">selected</#if>>Español</option>
                <option value="Ciencias" <#if nota.asignatura?? && nota.asignatura == "Ciencias">selected</#if>>Ciencias</option>
                <option value="Historia" <#if nota.asignatura?? && nota.asignatura == "Historia">selected</#if>>Historia</option>
                <option value="Inglés" <#if nota.asignatura?? && nota.asignatura == "Inglés">selected</#if>>Inglés</option>
            </select>
        </div>

        <div>
            <label class="block text-gray-700">Grado</label>
            <input type="text" name="grado" value="${nota.grado!}"
                   class="w-full border rounded px-3 py-2"/>
        </div>

        <div>
            <label class="block text-gray-700">Nota Definitiva</label>
            <input type="number" step="0.01" name="notaDefinitiva" value="${nota.notaDefinitiva!}"
                   class="w-full border rounded px-3 py-2"/>
        </div>

        <div>
            <label class="block text-gray-700">Estudiante</label>
            <select name="estudiante.id" class="w-full border rounded px-3 py-2">
                <#list estudiantes as e>
                    <option value="${e.id}" <#if nota.estudiante?? && nota.estudiante.id == e.id>selected</#if>>
                        ${e.nombres} ${e.apellidos} - Grado ${e.grado}
                    </option>
                </#list>
            </select>
        </div>

        <button type="submit" class="bg-green-600 text-white px-4 py-2 rounded">Guardar</button>
        <a href="/notas" class="bg-gray-500 text-white px-4 py-2 rounded">Cancelar</a>
    </form>
</@base.layout>
