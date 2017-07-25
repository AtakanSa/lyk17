package tr.org.linux.kamp.garbageCollector;

public class Gc {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		while(rt.freeMemory()!=0) {
			System.out.println(rt.freeMemory());
		}
	}
}



/*
*target*
*.jar
*.war
*.ear
*.class

# eclipse specific git ignore
*.pydevproject
.project
.metadata
bin/**
tmp/**
tmp/**/*
*.tmp
*.bak
*.swp
*~.nib
local.properties
.classpath
.settings/
.loadpath

# External tool builders
.externalToolBuilders/

# Locally stored "Eclipse launch configurations"
*.launch*/