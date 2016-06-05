#!/bin/bash

adddate(){
        while IFS= read -r line; do
                echo "$(date) $line"
        done
}


cd /home/fmz/git_repo/fengmengzhao.github.io/
git pull origin master | adddate >> /home/fmz/git_auto.log
