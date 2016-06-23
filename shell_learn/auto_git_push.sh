#!/bin/bash


adddate(){
        while IFS= read -r line; do
                echo "$(date) $line"
        done
}

# cd /home/fmz/git_repo/fengmengzhao.github.io/
# git add --a | adddate >> /home/fmz/git_auto.log
# git commit -m"auto push" | adddate >> /home/fmz/git_auto.log
# git push origin master | adddate >> /home/fmz/git_auto.log

cd /home/fmz/git_repo/fmzhao.github.io/
git add --a | adddate >> /home/fmz/git_auto.log
git commit -m"auto push" | adddate >> /home/fmz/git_auto.log
git push origin master | adddate >> /home/fmz/git_auto.log

rsync -azv /home/fmz/language_learn/ /home/fmz/git_repo/language_learn/
cd /home/fmz/git_repo/language_learn/
git add --a | adddate >> /home/fmz/git_auto.log
git commit -m"auto push" | adddate >> /home/fmz/git_auto.log
git push origin master | adddate >> /home/fmz/git_auto.log

rsync -azv /home/fmz/git_repo/fmzhao.github.io/* /home/fmz/git_repo/shy_wheat/
cd /home/fmz/git_repo/shy_wheat/
git add --a | adddate >> /home/fmz/git_auto.log
git commit -m"auto push" | adddate >> /home/fmz/git_auto.log
git push origin master | adddate >> /home/fmz/git_auto.log
