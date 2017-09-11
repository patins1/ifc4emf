# ifc4emf

The code in this project has a 2 stage process for constructing parsers for IFC files to create EMF Models.

Stage 1 is the creation of the Ecore model for a particular IFC EXPRESS schema, and some infrastructure for the parsing and pretty printing of IFC files.

Stage 2 is the "resource implementation" for IFC files that reads the files into an instance of the metamodel created in stage 1. This can be incorporated into a running Eclipse for reading IFC into memory as EMF models.

Currently IFC 2x3 is supported in the build, but the project is capable of using the IFC 4 EXPRESS Schema to generate a new parser/resource implementation.
