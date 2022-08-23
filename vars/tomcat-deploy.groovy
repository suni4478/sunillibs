def call(ip,username,id){
sshagent([id]){
sh " mv target/sunil*war target/app.war"
 // some block
sh "scp -o StrictHostKeyChecking=no target/app.war ${username}@${ip}:/opt/tomcat10/webapps"
sh "ssh ${username}@${ip} /opt/tomcat10/bin/shutdown.sh"
sh "ssh ${username}@${ip} /opt/tomcat10/bin/startup.sh"
