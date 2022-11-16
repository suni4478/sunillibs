def call(ip,username,id) { 
   sshagent(['id']) {
   sh "mv target/onlinebookstore*.war target/app.war"
     sh "scp -o StrictHostKeyChecking=no target/app.war ${username}@${ip}:/opt/tomcat9/webapps"
     sh "ssh -o StrictHostKeyChecking=no ${username}@${ip} /opt/tomcat9/bin/shutdown.sh"
     sh "ssh -o StrictHostKeyChecking=no ${username}@${ip} /opt/tomcat9/bin/startup.sh"
  }
}
