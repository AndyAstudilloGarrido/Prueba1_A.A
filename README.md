Pregunta 1: ¿Cuál es la principal ventaja de la compilación anticipada AOT (Ahead-of-Time) introducida
en el Android Runtime (ART) en comparación con el modelo tradicional de la JVM?
A) Reduce de manera permanente el espacio físico que requiere la aplicación instalada en el almacenamiento del
teléfono.
B) Traduce el bytecode a código de máquina nativo previo al inicio de la ejecución, mejorando la velocidad de inicio de
la app y disminuyendo el uso de la batería.
C) Facilita la creación automática de ramas en repositorios remotos sin usar la consola de Git.
D) Evita tener que registrar las actividades y servicios en el manifiesto general de la aplicación.
respuesta: A

Pregunta 2: ¿Cuál es la responsabilidad primordial del Linux Kernel dentro de la arquitectura de capas
del sistema operativo Android?
A) Ejecutar de forma directa el compilador asíncrono para renderizar las vistas infladas desde archivos XML.
B) Proveer APIs públicas de alto nivel en lenguaje Java para el uso directo de los desarrolladores en sus Activities.
C) Gestionar los controladores físicos de hardware de bajo nivel, la administración de la memoria RAM, los procesos
del sistema y la capa de seguridad nativa.
D) Servir de contenedor para las clases adaptadoras en un controlador de listas RecyclerView.
repuesta: C

Pregunta 3: ¿Qué función cumple la capa HAL (Hardware Abstraction Layer) en la arquitectura interna
de Android?
A) Define interfaces de software estándar para que las APIs de alto nivel de Java se comuniquen con los componentes
físicos del hardware (cámara, sensores, Bluetooth) independientemente de la implementación del fabricante.
B) Reemplaza por completo el uso de ConstraintLayouts para optimizar los ciclos de CPU.
C) Cifrar localmente la base de datos SQLite para proteger la información de la aplicación.
D) Compilar directamente el código Java de la aplicación en bytecode compatible con dispositivos antiguos.
Respuesta: D

Pregunta 4: Cuando una Activity en primer plano pierde el foco de forma parcial pero sigue siendo
visible para el usuario, ¿qué método de su ciclo de vida es invocado secuencialmente en primer lugar?
A) onDestroy(), destruyendo de inmediato todos los elementos del diseño visual para liberar RAM.
B) onPause(), suspendiendo operaciones que consuman CPU pero manteniendo las variables y el estado visual
cargados en memoria.
C) onResume(), forzando el reinicio del dibujo de la interfaz de forma síncrona.
D) onCreate(), para inflar nuevamente la vista desde su recurso de diseño XML.
Respuesta B

Pregunta 5: Si se invoca un Intent explícito para navegar a una pantalla de confirmación, pero esta
pantalla no se encuentra registrada en el archivo AndroidManifest.xml, ¿qué sucede en tiempo de
ejecución?
A) La navegación se procesa normalmente, pero la pantalla destino se dibuja en blanco.
B) El compilador de Gradle bloquea la construcción y prohíbe la generación de la aplicación.
C) El sistema operativo asume un mapeo por defecto sin interrumpir la experiencia.
D) La aplicación se detiene inmediatamente arrojando un error crítico de tipo ActivityNotFoundException.
Respuesta D

Pregunta 6: Dentro de los componentes estructurales de una aplicación en Android, ¿cuál es el
objetivo técnico de un Content Provider?
A) Ejecutar tareas pesadas de peticiones de red en un subproceso asíncrono secundario.
B) Administrar y centralizar el acceso a repositorios de datos locales de forma segura, permitiendo el intercambio
controlado de información entre distintas aplicaciones.
C) Controlar el direccionamiento de eventos táctiles en pantallas que usen RecyclerView.
D) Almacenar temporalmente los recursos estáticos de imagen en la carpeta drawable.
Respuesta C
Pregunta 7: ¿En qué escenario del desarrollo de Android es obligatorio el uso de un Intent de tipo
Explícito?
A) Cuando se solicita al sistema operativo abrir la aplicación de mapas externa para trazar una ruta.
B) Cuando se busca transferir el control a una actividad interna del propio proyecto de la cual se conoce con exactitud
su nombre de clase Java (ej: ConfirmacionActivity.class).
C) Cuando se comparte un fragmento de texto o imagen con aplicaciones de mensajería de terceros.
D) Cuando se necesita cambiar el tema visual de la aplicación según la hora del dispositivo.
Respuesta B

Pregunta 8: Cuando una Activity es enviada a segundo plano e ingresa en el estado de Detenida
(onStop()), y el sistema operativo sufre de una necesidad crítica de memoria RAM para priorizar
llamadas de voz u otras apps, ¿qué acción toma el sistema?
A) Almacena el diseño en caché física SD de manera temporal para protegerlo.
B) Ignora la falta de memoria para evitar la degradación del proceso.
C) Puede matar silenciosamente el proceso de la aplicación, forzando la recreación completa (onCreate()) de la Activity
cuando el usuario regrese a ella.
D) Ejecuta onResume() de forma automática en segundo plano para reactivar los componentes.
Respuesta D
