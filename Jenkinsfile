// comment
pipeline {
 agent any
 stages {
    stage('Git-Checkout-Jenkins-Docker'){     
    	 when {
            branch 'master'
         }        
         steps{
            echo 'Revisando repositorio del Proyecto'
			git poll: true, url: 'https://github.com/edeleon2408/jenkins-docker.git'
         }        	
     }
     stage('Construyendo Proyecto'){
     }
  }
}
