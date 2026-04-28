Template Method

1. estudar a intenção do padrão recebido;

Exemplo: Construção em massa de casas, a maioria dos itens são os mesmos porém com colocações diferentes. As portas, janelas e afins de uma casa é um lugar, porém na outra é em outros lugares. Fazendo que o construtor não precise mudar a base que seria a casa mas conseguindo fazer pequenos ajustes como a localização da porta ou afins.

2. entender qual problema ele resolve;

Resolver o problema de duplicação de código;
Falta de padronização em etapas estruturais idênticas, mas alguns passos específicos diferentes;
Facilita a manutenção e expansão, novos comportamentos podem ser adicionados criando novas subclasses, sem precisar modificar o código existente (seguindo o princípio Aberto/Fechado), pois estará organizado;
