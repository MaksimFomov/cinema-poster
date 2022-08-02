<div class="card-columns">
    <#list movies as movie>
        <a href="/product/${movie.id}">
            <div>

                <img width="50" height="50" src="${movie.image}"
                     class="card-img-top">
                <div class="card-body">
                    <h5 class="card-title">${movie.name}</h5>
                    <p class="card-text">${movie.description}</p>
                </div>
            </div>
        </a>
    <#else>
        <h1 style="text-align: center">Не найдено</h1>
    </#list>
</div>