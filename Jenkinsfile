// comment
pipeline {
 agent any
 stages {
    stage('Checkout-Proyecto'){     
    	 steps{
            echo 'Revisando repositorio del Proyecto'
			git poll: true, url: 'https://github.com/edeleon2408/jenkins-docker.git'
         }        	
    }
    stage('Clean-and-Build-Proyecto'){     
    	 steps{
            echo 'Limpiando y Construyendo Proyecto'
			bat 'mvn clean compile install'
	   }        	
    }
    
    
  }
}
