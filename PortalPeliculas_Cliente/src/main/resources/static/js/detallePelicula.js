document.addEventListener("DOMContentLoaded", function() {
    const actores = document.querySelectorAll("#actores-list li");
    const actoresArray = Array.from(actores).map(actor => {
        const actorId = actor.getAttribute("data-id");
        const actorNombre = actor.textContent.trim();
        return `<a href="/cactor/detalle/${actorId}">${actorNombre}</a>`;
    });
    const actoresTexto = actoresArray.join(", ");

    const actoresElemento = document.getElementById("actores");
    actoresElemento.innerHTML = actoresTexto;
});
