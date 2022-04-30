$ ->
  $.get "/product?id=&action=All", (products) ->
    $.each products, (index, product) ->
      $("#products-list").append $("div").text(product)