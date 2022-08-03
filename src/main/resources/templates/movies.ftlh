<div>
    <#list movies as movie>
        <a href="/movie/${movie.id}">
            <div>
                <img width="150" height="150" src="${movie.image}">
                <div>
                    <h5>${movie.name}</h5>
                </div>
            </div>
        </a>
        <hr>
    <#else>
        <h1 style="text-align: center">Не найдено</h1>
    </#list>
</div>