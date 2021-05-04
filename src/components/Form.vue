<template>
  <div class="container">
  <div class="row pt-4">
      <div class="col-8">
        <img src="../../public/img/images/imageLogin.jpg" width="650" alt="imageLogin">
      </div>
      <div class="col-4">
          <h1 class="h1 font-weight-bolder">Iniciar Sesión</h1>
          <div class="card pt-3">
            <form class="px-4 py-3">
                <div class="form-group">
                <label for="exampleDropdownFormEmail1">Correo Electrónico</label>
                <input type="email" class="form-control" id="exampleDropdownFormEmail1" placeholder="email@example.com">
                </div>
                <div class="form-group">
                <label for="exampleDropdownFormPassword1">Contraseña</label>
                <input type="password" class="form-control" id="exampleDropdownFormPassword1" placeholder="Password">
                </div>
                <div class="form-group">
                <!--
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="dropdownCheck">
                    <label class="form-check-label" for="dropdownCheck">
                    Remember me
                    </label>
                </div> -->
                </div>
                <button type="submit" class="btn btn-primary">Sign in</button>
            </form>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">¿Olvidaste tu contraseña?, da click aquí.</a>
            </div>
            
            
      </div>
    </div>
</div>
  
</template>

<script>
export default {

}
</script>

<style>

</style>