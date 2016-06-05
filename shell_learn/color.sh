#!/bin/bash
for((color=0; color<256; color++));do
        tput setaf "$color"
        printf "test"
done
