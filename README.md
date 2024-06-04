mongodb+srv://hafizurupm:3XB2Cz4vgv1Il2gq@youthconnect-cluster.86wwy3w.mongodb.net/?retryWrites=true&w=majority&appName=youthconnect-cluster

pandoc youthconnect-api-docs.md -o youthconnect-api-docs.docx

# Running the Shell Script

## 1. Install Required Tools

Ensure that `mongo`, `mongoimport`, and `jq` are installed on your system.

### On Ubuntu/Debian
```bash
sudo apt-get update
sudo apt-get install -y mongodb-clients jq
```

### On macOS (using Homebrew)
```bash
brew tap mongodb/brew
brew install mongodb-database-tools
brew install jq
```

### On Windows

#### 1 Install MongoDB Tools:

Download the MongoDB Database Tools MSI from the [MongoDB Download Center](https://www.mongodb.com/try/download/database-tools) and follow the installation instructions.

#### 2 Install jq:

Download the `jq` binary from the [jq GitHub Releases page](https://github.com/stedolan/jq/releases) and place it in a directory that is included in your system's PATH.


### To run the `.sh` (shell script) file provided in this repository, follow these steps:

## 2. Make the Script Executable

Ensure that the script file has executable permissions. Open a terminal and navigate to the directory where your script is located, then run:

```bash
chmod +x src/main/resources/datasource/sync.sh
```

## 3. Run the Script
```bash
./src/main/resources/datasource/sync.sh
```

## To build this project using gradle use this command :
```bash
./gradlew build
```

## To Run this project by this command : 
```bash
./gradlew clean bootRun
```
