$ ->
  $.get "/user/session", (sessions) ->
    $.each sessions, (_, _) ->
      $(".add_to_cart_button").disable = true
