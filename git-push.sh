#!/bin/bash  
  
echo "Enter the commit message: "
read commit_message

git add .
git commit -am "$commit_message"
git push origin main

clear
echo "Done!"
sleep 3
clear
