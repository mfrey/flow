TEXFILE=doc.tex
FILE=doc.tex
FILE2=doc
BIBFILE=doc.bib
PDFFILE=doc.pdf
DVIFILE=doc.dvi
PSFILE=doc.ps

BIBTEX=bibtex
PDF=pdflatex
TEX=latex
PDFPROG=acroread

all: ps2pdf 

ps2pdf:$(FILE)
	pdflatex $(FILE)        \
	&& pdflatex $(FILE)    \
	&& bibtex $(FILE2)    \
	&& bibtex $(FILE2)   \
	&& pdflatex $(FILE)     \
	&& pdflatex $(FILE)    \
	&& pdflatex $(FILE)

#	latex $(FILE)
#	latex $(FILE)
#	dvips $(DVIFILE)
#	ps2pdf $(PSFILE)

# PDF erzeugen
pdflatex: $(TEXFILE) 
	$(PDF) $(TEXFILE) 

bibtex: $(TEXFILE) 
	$(TEX) $(TEXFILE) 
	$(BIBTEX) $(BIBFILE)
	$(TEX) $(TEXFILE) 
	$(TEX) $(TEXFILE) 

bib:
	$(BIBTEX) $(BIBFILE)

show:
	$(PDFPROG) $(PDFFILE)&

.PHONY: clean
clean:
	rm -f *.dvi *.toc *.log *.aux *.b*
	rm -f doc.pdf *.out
