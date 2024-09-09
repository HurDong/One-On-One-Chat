which mongo
apt-get update
apt-get install -y mongodb-clients
mongo
apt-get install -y gnupg
wget -qO - https://www.mongodb.org/static/pgp/server-4.4.asc | apt-key add -
apt-get update
apt-get install -y curl
curl -fsSL https://www.mongodb.org/static/pgp/server-4.4.asc | tee /usr/share/keyrings/mongodb-archive-keyring.gpg
echo "deb [ arch=amd64,arm64 signed-by=/usr/share/keyrings/mongodb-archive-keyring.gpg ] https://repo.mongodb.org/apt/ubuntu $(lsb_release -cs)/mongodb-org/4.4 multiverse" | tee /etc/apt/sources.list.d/mongodb-org-4.4.list
apt-get update
apt-get install -y mongodb-org-shell
mongo
echo "deb [ arch=amd64,arm64 signed-by=/usr/share/keyrings/mongodb-archive-keyring.gpg ] https://repo.mongodb.org/apt/ubuntu focal/mongodb-org/4.4 multiverse" | tee /etc/apt/sources.list.d/mongodb-org-4.4.list
apt-get update
apt-get update
mongo
exit
mongo --host localhost --port 27017
mongodb --host localhost --port 27017
docker run -it --rm --network="host" mongo:latest mongo --host localhost --port 27017
exit
eixt
exit
apt-get update
apt-get install -y mongo-tools
mongo --host localhost --port 27017
exit
mongo
use testdb
apt-get update
apt-get install -y mongodb-org-shell
mongo
find / -name mongo
find / -name mongo 2>/dev/null
find / -name mongo 2>/dev/null
find / -name mongo 2>/dev/null
find / -name mongo 2>/dev/null
find / -name mongo 2>/dev/null
exit
mongod
mongo
apt-get update
curl -fsSL https://www.mongodb.org/static/pgp/server-4.4.asc | sudo tee /usr/share/keyrings/mongodb-archive-keyring.gpg
exit
