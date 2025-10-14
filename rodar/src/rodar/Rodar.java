from fpdf import FPDF

# Criar classe personalizada para o PDF
class PDF(FPDF):
    def header(self):
        self.set_font("Arial", "B", 14)
        self.cell(0, 10, "Relatório do Programa Java - Participantes e Notas", ln=True, align="C")
        self.ln(5)

    def chapter_title(self, title):
        self.set_font("Arial", "B", 12)
        self.set_text_color(0)
        self.cell(0, 10, title, ln=True)
        self.ln(2)

    def chapter_body(self, body):
        self.set_font("Arial", "", 11)
        self.multi_cell(0, 8, body)
        self.ln()

pdf = PDF()
pdf.add_page()

# Adicionando conteúdo
pdf.chapter_title("1. Visão Geral")
pdf.chapter_body(
    "Este programa em Java permite inserir dados de participantes (nome e notas), "
    "calcula a média das notas de Português, Matemática e Conhecimentos Gerais, "
    "classifica cada participante como Aprovado, Recuperação ou Reprovado, e permite "
    "inserir um número indefinido de participantes usando Scanner."
)

pdf.chapter_title("2. Fluxograma do Programa")
pdf.chapter_body(
    "INÍCIO\n"
    "  |\n"
    "Criar listas para dados\n"
    "  |\n"
    "Inserir dados do participante\n"
    "  |\n"
    "Calcular média e verificar situação\n"
    "  |\n"
    "Deseja continuar? (s/n)\n"
    "  |         \\\n"
    " 's'         'n'\n"
    "  |           |\n"
    "Volta    Exibir resultados\n"
    "            |\n"
    "           FIM"
)

pdf.chapter_title("3. Etapas do Programa")
pdf.chapter_body(
    "1. Criar listas com ArrayList.\n"
    "2. Criar Scanner para ler dados do teclado.\n"
    "3. Usar laço while para continuar inserindo participantes.\n"
    "4. Coletar nome e notas do participante.\n"
    "5. Calcular a média das três notas.\n"
    "6. Verificar a situação do participante.\n"
    "7. Armazenar todos os dados nas listas.\n"
    "8. Exibir todos os resultados ao final."
)

pdf.chapter_title("4. Detalhamento das Variáveis")
pdf.chapter_body(
    "scanner: Scanner - lê entrada do teclado.\n"
    "nomes: ArrayList<String> - nomes dos participantes.\n"
    "portugues, matematica, conhecimentos: ArrayList<Double> - notas por matéria.\n"
    "medias: ArrayList<Double> - médias calculadas.\n"
    "situacoes: ArrayList<Integer> - 1: aprovado, 0: recuperação, -1: reprovado.\n"
    "continuar: String - controla o laço de repetição.\n"
    "notaPort, notaMat, notaCon: double - notas individuais.\n"
    "media: double - média final.\n"
    "nenhumaNotaBaixa: boolean - verifica se nenhuma nota é menor que 2."
)

pdf.chapter_title("5. Regras de Classificação")
pdf.chapter_body(
    "- Aprovado: média > 4 e nenhuma nota < 2.\n"
    "- Reprovado: média < 2.\n"
    "- Recuperação: qualquer outro caso."
)

pdf.chapter_title("6. Exemplo de Execução")
pdf.chapter_body(
    "Digite o nome do participante:\n"
    "João\n"
    "Digite a nota de Portugues para João:\n"
    "5\n"
    "Digite a nota de Matematica para João:\n"
    "6\n"
    "Digite a nota de Conhecimentos Gerais para João:\n"
    "4\n"
    "Deseja continuar? (s/n):\n"
    "n\n\n"
    "RESULTADOS FINAIS\n"
    "Participante: João\n"
    "Portugues: 5.0\n"
    "Matematica: 6.0\n"
    "Conhecimentos Gerais: 4.0\n"
    "Media: 5.0\n"
    "Situacao: Aprovado"
)

pdf.chapter_title("7. Resumo Final")
pdf.chapter_body(
    "- Usa listas dinâmicas (ArrayList) para armazenar participantes.\n"
    "- Usa Scanner para entrada manual.\n"
    "- Usa laço while para número indefinido de entradas.\n"
    "- Verifica média e notas para classificação.\n"
    "- Exibe todos os resultados no final."
)

# Gerar o PDF
pdf.output("relatorio_java_participantes.pdf")

print("PDF gerado com sucesso: relatorio_java_participantes.pdf")
