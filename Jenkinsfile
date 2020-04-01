// comment
pipeline {
 agent any
 stages {
        stage('Checkout-git-kaizen'){
            /* when {
                    branch 'master'
             }*/
               steps{
                echo 'Revisando repositorio del Proyecto Kaizen'
		git poll: true, url: 'https://edeleon28@bitbucket.org/grupo_asd_dd/kaz_prs_backend.git', credentialsId: 'f65662d9-fa64-4721-b964-793bf374a004'
               }
        }
        stage('Install kaizen-system') {
             /*when {
                branch 'master'
            }*/
            steps {
                echo 'Realizando Install al Proyecto kaizen-system'
                bat """
                      call cd kaizen-system
                      call dir
                      call C:\\maven-3.6.2\\bin\\mvn clean compile install deploy -U  
                    """
                
		//sh 'mvn clean compile install deploy'

            }
        }
        stage('Install kaizen-core') {
            /* when {
                branch 'master'
            }*/
            steps {
                echo 'Realizando Install al Proyecto kaizen-core'
                bat """
                      call cd kaizen-core
                      call dir
                      call C:\\maven-3.6.2\\bin\\mvn clean compile install deploy -U  
                    """
		//sh 'mvn clean compile install deploy'

            }
        }
        stage('Packaging kaizen-admin-api') {
            /* when {
            branch 'master'
	 }*/
            steps {
                echo 'Realizando Packaging al Proyecto kaizen-admin-api'
                bat """ 
                      call cd kaizen-admin-api
                      call dir
                      call C:\\maven-3.6.2\\bin\\mvn clean compile package deploy -U  
                    """
		//sh 'mvn clean compile package deploy'

            }
        }
        stage('Packaging kaizen-api') {
            /* when {
            branch 'master'
	 }*/
            steps {
                echo 'Realizando Packaging al Proyecto kaizen-api'
                bat """  
                      call cd kaizen-api
                      call dir
                      call C:\\maven-3.6.2\\bin\\mvn clean compile package deploy -U  
                    """
		//sh 'mvn clean compile package deploy'

            }
        }        
        stage('Sending SonarQube kaizen') {
           /*  when {
            branch 'master'
	 }*/
            steps {
                echo 'Realizando deploy hacia SonarQube'
                /*bat """
                      call cd kaizen-api  
                      call C:\\maven-3.6.2\\bin\\mvn sonar:sonar -Dsonar.projectKey=kaizen-api -Dsonar.host.url=http://172.27.244.180:9000 -Dsonar.login=e799fc83980ef097d519d379b6290ab17f6f29aa  
                      call cd
                      call cd kaizen-admin-api  
                      call C:\\maven-3.6.2\\bin\\mvn sonar:sonar -Dsonar.projectKey=kaizen-admin-api -Dsonar.host.url=http://172.27.244.180:9000 -Dsonar.login=e799fc83980ef097d519d379b6290ab17f6f29aa  
                      call cd
                      call cd kaizen-core\\kaizen-core-domain  
                      call C:\\maven-3.6.2\\bin\\mvn sonar:sonar -Dsonar.projectKey=kaizen-core-domain -Dsonar.host.url=http://172.27.244.180:9000 -Dsonar.login=e799fc83980ef097d519d379b6290ab17f6f29aa  
                      call cd
                      call cd kaizen-core\\kaizen-core-service  
                      call C:\\maven-3.6.2\\bin\\mvn sonar:sonar -Dsonar.projectKey=kaizen-core-service -Dsonar.host.url=http://172.27.244.180:9000 -Dsonar.login=e799fc83980ef097d519d379b6290ab17f6f29aa  
                      call cd
                      call cd kaizen-core\\kaizen-core-service-impl  
                      call C:\\maven-3.6.2\\bin\\mvn sonar:sonar -Dsonar.projectKey=kaizen-core-service-impl -Dsonar.host.url=http://172.27.244.180:9000 -Dsonar.login=e799fc83980ef097d519d379b6290ab17f6f29aa  
                      call cd
                      call cd kaizen-system\\kaizen-system-common  
                      call C:\\maven-3.6.2\\bin\\mvn sonar:sonar -Dsonar.projectKey=kaizen-system-common -Dsonar.host.url=http://172.27.244.180:9000 -Dsonar.login=e799fc83980ef097d519d379b6290ab17f6f29aa  
                      call cd
                      call cd kaizen-system\\kaizen-system-domain  
                      call C:\\maven-3.6.2\\bin\\mvn sonar:sonar -Dsonar.projectKey=kaizen-system-domain -Dsonar.host.url=http://172.27.244.180:9000 -Dsonar.login=e799fc83980ef097d519d379b6290ab17f6f29aa  
                      call cd
                      call cd kaizen-system\\kaizen-system-security  
                      call C:\\maven-3.6.2\\bin\\mvn sonar:sonar -Dsonar.projectKey=kaizen-system-security -Dsonar.host.url=http://172.27.244.180:9000 -Dsonar.login=e799fc83980ef097d519d379b6290ab17f6f29aa  
                      call cd
                      call cd kaizen-system\\kaizen-system-service  
                      call C:\\maven-3.6.2\\bin\\mvn sonar:sonar -Dsonar.projectKey=kaizen-system-service -Dsonar.host.url=http://172.27.244.180:9000 -Dsonar.login=e799fc83980ef097d519d379b6290ab17f6f29aa  
                      call cd
                      call cd kaizen-system\\kaizen-system-service-impl  
                      call C:\\maven-3.6.2\\bin\\mvn sonar:sonar -Dsonar.projectKey=kaizen-system-service-impl -Dsonar.host.url=http://172.27.244.180:9000 -Dsonar.login=e799fc83980ef097d519d379b6290ab17f6f29aa  
                      
                      """
                */    
		//sh 'C:\\maven-3.6.2\\bin\\mvn sonar:sonar -Dsonar.projectKey=kaizen -Dsonar.host.url=http://172.27.244.180:9000 -Dsonar.login=e799fc83980ef097d519d379b6290ab17f6f29aa'

            }
        }
        
       /*
        stage('Build Docker kaizen-admin-api') {
            steps {
            	sh '''
            		docker build -f kaizen-admin-api\\docker\\Dockerfile -t kaizen-admin-api .
                '''
            }
        } 
        stage('Build Docker kaizen-api') {
            steps {
            	sh '''
            		docker build -f kaizen-api\\docker\\Dockerfile -t kaizen-api .
                '''
            }
        } 
        stage('PushDockerImage') {
                steps {
                    sh '''
                            docker tag kaizen-admin-api kaizen-admin-api:latest
                                            docker push kaizen-admin-api:latest
                                            docker rmi kaizen-admin-api:latest
                    '''
                }
            }*/ 
  }

    post {
        always {  
             echo '***************Esta linea se ejecutara siempre*****************'  
         }  
         success {  
             echo '***************Esta linea se ejecutara cuando finalice en SUCCESS todo el proceso*****************' 
         }  
         failure {  
             echo '***************Esta linea se ejecutara cuando falle el proceso*****************' 
             mail bcc: '', body: "<b>Example</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "edeleon@grupoasd.com.co";  
         }  
    } 
}

