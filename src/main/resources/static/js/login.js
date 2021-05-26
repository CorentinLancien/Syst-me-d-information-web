import Vue from 'https://cdn.jsdelivr.net/npm/vue@2.6.12/dist/vue.esm.browser.js'


var app = new Vue({
    el: '#login',

    data: {
      username: "",
      password: "",
      isConnected: false,
      errors: [ 
          
      ]

    },
    methods:{
        verifyConnexion(e){

                fetch('/api/utilisateur/',
                {
                    method: 'POST',
                    headers: { "Content-Type": "application/json" },
                    body: JSON.stringify({ 
                        username: this.username,
                        password: this.password
                    })
                }).then(response => response.json())
                .then(data => this.isConnected = data
                )
            console.log(this.isConnected);    
           
            e.preventDefault();
       }
    }

  });