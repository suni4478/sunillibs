def call(ip,id,username) {
  sshagent(['id']) {
  sh "mv target/sunil*.war target/sunil.war"
  sh "scp -o StrictHostKeyChecking=no target/sunil.war ${username}@${ip}:/opt/tomcat9/webapps"
  sh "ssh ${username}@${ip} /opt/tomcat9/bin/shutdown.sh"
  sh "ssh ${username}@${ip} /opt/tomcat9/bin/startup.sh"
  }
}
