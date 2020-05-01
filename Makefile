all:
	echo "Makefile is still to be done. For the time being you can only compile the dummy example with 'make dummy_example'."

dummy_example:
	gcc -g -I windowmanager/include/ `find windowmanager/ -name "*.c"` examples/dummy/main.c -o examples/dummy/dummy	
