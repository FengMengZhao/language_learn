package org.fmz.pattern;

import java.util.*;

public class ExecutableCollection implements Executable{
    protected Collection<Executable> executables = new LinkedList<>();

    public void addExecutable(Executable executable){// composition
        executables.add(executable);
    }

    public void removeExecutable(Executable executable){
        executables.remove(executable);
    }

    public void execute(){
        for(Iterator iter = executables.iterator(); iter.hasNext();){
            ((Executable)iter.next()).execute();
        }
    }
}
