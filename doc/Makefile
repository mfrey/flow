ECHOCMD:=/bin/echo -e
LATEX:=pdflatex
BIBTEX:=bibtex
DVIPDF:=dvipdf

TARGET:=doc

default: main

main:
	@$(LATEX)  $(TARGET)
	@$(BIBTEX) $(TARGET)
	@$(LATEX)  $(TARGET)
	@$(LATEX)  $(TARGET)
#	@$(DVIPDF) $(TARGET)

.PHONY: clean

clean:
	@rm -f $(TARGET).aux \
	       $(TARGET).log \
	       $(TARGET).nav \
	       $(TARGET).out \
	       $(TARGET).snm \
	       $(TARGET).toc \
	       $(TARGET).vrb \
	       $(TARGET).pdf \
	       $(TARGET).dvi \
	       $(TARGET).ps  \
	       $(TARGET).bbl \
	       $(TARGET).blg \
	       $(TARGET).thm \
	       $(TARGET).brf \
	       missfont.log  \
	       *.log
	@rm -f *~
