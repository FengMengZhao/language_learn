#!/bin/bash


adddate(){
        while IFS= read -r line; do
                echo "$(date) $line"
        done
}

cd /home/fmz/git_repo/fengmengzhao.github.io/
git add . | adddate >> /home/fmz/git_auto.log
git commit -m"auto push" | adddate >> /home/fmz/git_auto.log
git push origin master | adddate >> /home/fmz/git_auto.log
