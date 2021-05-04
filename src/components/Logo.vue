<template>
  <section class="logo-section">
    <button class="logo-spin spin thick" v-once>{{ sistema }}</button>
  </section>
</template>

<script>
export default {
    props:{
        sistema: String
    }
}
</script>

<style scoped>
.logo-section {
	 isolation: isolate;
}
.logo-spin {
	 background: none;
	 border: 0;
	 box-sizing: border-box;
	 margin: 0.5em;
	 padding: 1em 2em;
	 box-shadow: inset 0 0 0 2.5px #f45e61;
	 color: #f45e61;
	 font-size: inherit;
	 font-weight: 700;
	 position: relative;
	 vertical-align: middle;
}
 .logo-spin::before, .logo-spin::after {
	 box-sizing: inherit;
	 content: '';
	 position: absolute;
	 width: 100%;
	 height: 100%;
}
.spin {
	 width: 5em;
	 height: 5em;
	 padding: 0;
}
 .spin:hover {
	 color: #0eb7da;
}
 .spin::before, .spin::after {
	 top: 0;
	 left: 0;
}
 .spin::before {
	 border: 2px solid transparent;
}
 .spin:hover::before {
	 border-top-color: #0eb7da;
	 border-right-color: #0eb7da;
	 border-bottom-color: #0eb7da;
	 transition: border-top-color 0.15s linear, border-right-color 0.15s linear 0.1s, border-bottom-color 0.15s linear 0.2s;
}
 .spin::after {
	 border: 0 solid transparent;
}
 .spin:hover::after {
	 border-top: 2px solid #0eb7da;
	 border-left-width: 2px;
	 border-right-width: 2px;
	 transform: rotate(270deg);
	 transition: transform 0.4s linear 0s, border-left-width 0s linear 0.35s;
}
 .thick {
	 color: #f45e61;
}
 .thick:hover {
	 color: #fff;
	 font-weight: 700;
}
 .thick::before {
	 border: 2.5em solid transparent;
	 z-index: -1;
}
 .thick::after {
	 mix-blend-mode: color-dodge;
	 z-index: -1;
}
 .thick:hover::before {
	 background: #f45e61;
	 border-top-color: #f45e61;
	 border-right-color: #f45e61;
	 border-bottom-color: #f45e61;
	 transition: background 0s linear 0.4s, border-top-color 0.15s linear, border-right-color 0.15s linear 0.15s, border-bottom-color 0.15s linear 0.25s;
}
 .thick:hover::after {
	 border-top: 2.5em solid #f45e61;
	 border-left-width: 2.5em;
	 border-right-width: 2.5em;
}
</style>