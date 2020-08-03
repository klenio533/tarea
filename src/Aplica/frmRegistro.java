
package Aplica;
import Clases.*;
import javax.swing.DefaultListCellRenderer.UIResource;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class frmRegistro extends javax.swing.JFrame {
    
    static ArregloLibro lista = new ArregloLibro();
    UIResource posicion = new UIResource();
    boolean eliminar=false;
    boolean editar=false;
    

    static DefaultListModel LibroNombre    = new DefaultListModel();
    static DefaultListModel LibroAño       = new DefaultListModel();
    static DefaultListModel LibroPaginas   = new DefaultListModel();
    static DefaultListModel LibroCosto     = new DefaultListModel();
    static DefaultListModel LibroEditorial = new DefaultListModel();
    static DefaultListModel LibroClase     = new DefaultListModel();    

    public frmRegistro()
    {
        initComponents();
        Formulario();
        InicializarListas();
        
    }
    
    private void Formulario()
    {
        setLocationRelativeTo(this);
        setResizable(false);
        setTitle("Registros de Libros");
        posicion.setHorizontalAlignment(SwingConstants.CENTER);
    }
    private void InicializarListas()
    {
        listAño.setModel(LibroAño);
        listClase.setModel(LibroClase);
        listCosto.setModel(LibroCosto);
        listEditorial.setModel(LibroEditorial);
        listNombre.setModel(LibroNombre);
        listPaginas.setModel(LibroPaginas);
        
        listAño.setCellRenderer(posicion);
        listPaginas.setCellRenderer(posicion);
        listCosto.setCellRenderer(posicion);
        listEditorial.setCellRenderer(posicion);
    }

    private void LimpiarCampos()
    {
        txtNombre.setText("");
        txtAño.setText("");
        txtCosto.setText("");
        txtPaginas.setText("");
    }

    private String CapturarNombre()
    {
        String nom;
        nom=Validar.DarFormaNombres(txtNombre.getText().trim());
        return nom;
    }
    private int CapturarAño()
    {
        int año;
        año=Integer.parseInt(txtAño.getText().trim());
        return año;
    }
    private int CapturarPaginas()
    {
        int paginas;
        paginas=Integer.parseInt(txtPaginas.getText().trim());
        return paginas;
    }
    private double CapturarCosto()
    {
        double costo;
        costo=Double.parseDouble(txtCosto.getText().trim());
        return costo;
    }
    private String CapturarEditorial()
    {
        String editorial;
        editorial=cbEditorial.getSelectedItem().toString();
        return editorial;
    }
    private String CapturarClase()
    {
        String Clase;
        Clase=cbClase.getSelectedItem().toString();
        return Clase;
    }
    private void CapturarDatos()
    {
        Libro libro = new Libro(CapturarNombre(), CapturarEditorial(), CapturarClase(), CapturarAño(), CapturarPaginas(), CapturarCosto());
        lista.Adicionar(libro);
        LimpiarCampos();
    }
                    
    private void ListarAño()
    {
        LibroAño.clear();
        Libro x;
        for (int i = 0; i < lista.Tamaño(); i++)
        {      
            x=lista.Obtener(i);
            LibroAño.add(i,x.getAño());
        }
    }
    private void ListarClase()
    {
        LibroClase.clear();
        Libro x;
        for (int i = 0; i < lista.Tamaño(); i++)
        {      
            x=lista.Obtener(i);
            LibroClase.add(i,x.getClase());
        }
    }
    private void ListarCosto()
    {
        LibroCosto.clear();
        Libro x;
        for (int i = 0; i < lista.Tamaño(); i++)
        {      
            x=lista.Obtener(i);
            LibroCosto.add(i,x.getCosto());
        }
    }
    private void ListarEditorial()
    {
        LibroEditorial.clear();
        Libro x;
        for (int i = 0; i < lista.Tamaño(); i++)
        {      
            x=lista.Obtener(i);
            LibroEditorial.add(i,x.getEditorial());
        }
    }
    private void ListarNombre()
    {
        LibroNombre.clear();
        Libro x;
        for (int i = 0; i < lista.Tamaño(); i++)
        {      
            x=lista.Obtener(i);
            LibroNombre.add(i,x.getNombre());
        }
    }
    private void ListarPaginas()
    {
        LibroPaginas.clear();
        Libro x;
        for (int i = 0; i < lista.Tamaño(); i++)
        {      
            x=lista.Obtener(i);
            LibroPaginas.add(i,x.getPaginas());
        }
    }
    public void ListarDatos()
    {
        ListarAño();
        ListarClase();
        ListarCosto();
        ListarEditorial();
        ListarNombre();
        ListarPaginas();
    }
    
    private void AleatorioAño()
    {
        int año = Validar.GenerarNumeroAleatorios(2020, 1950);
        txtAño.setText(String.valueOf(año));
        CapturarAño();
    }
    private void AleatorioPaginas()
    {
        int paginas = Validar.GenerarNumeroAleatorios(500, 10);
        txtPaginas.setText(String.valueOf(paginas));
    }
    private void AleatorioCosto()
    {
        double costo = Validar.GenerarNumeroAleatoriosDouble(600.0, 000.0);
        txtCosto.setText(String.valueOf(costo));
    }
    private void AleatorioEditorial()
    {
        int numero = Validar.GenerarNumeroAleatorios(2,0);
        cbEditorial.setSelectedIndex(numero);
    }
    private void AleatorioClase()
    {
        int numero = Validar.GenerarNumeroAleatorios(2,0);
        cbClase.setSelectedIndex(numero);
    }
    private void AleatorioDatos()
    {
        AleatorioAño();   
        AleatorioCosto();
        AleatorioPaginas();
        AleatorioClase();
        AleatorioEditorial();
    }


    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        listCosto = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        listEditorial = new javax.swing.JList<>();
        btnAleatorio = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAgregar3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        txtPaginas = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cbEditorial = new javax.swing.JComboBox<>();
        cbClase = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEstadistica = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listNombre = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAño = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        listClase = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        listPaginas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        listCosto.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(listCosto);

        listEditorial.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(listEditorial);

        btnAleatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aleatorio.png"))); // NOI18N
        btnAleatorio.setToolTipText("Generar los datos del libro");
        btnAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAleatorioActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setToolTipText("Bucar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.png"))); // NOI18N
        btnAgregar3.setToolTipText("Reiniciar toda la lista");
        btnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DEL LIBRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(135, 85, 111))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 93, 103), 2));

        txtNombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setToolTipText("Ingrese el Nombre del Libro");
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE DEL LIBRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtAño.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAño.setForeground(new java.awt.Color(255, 255, 255));
        txtAño.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAño.setToolTipText("Ingrese el año de edicion del libro");
        txtAño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AÑO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });

        txtPaginas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPaginas.setForeground(new java.awt.Color(255, 255, 255));
        txtPaginas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPaginas.setToolTipText("Ingrese las paginas del libro");
        txtPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PAGINAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtPaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaginasKeyTyped(evt);
            }
        });

        txtCosto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(255, 255, 255));
        txtCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCosto.setToolTipText("Ingrese el costo del libro");
        txtCosto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COSTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 93, 103), 2));

        cbEditorial.setBackground(new java.awt.Color(50, 47, 61));
        cbEditorial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbEditorial.setForeground(new java.awt.Color(255, 255, 255));
        cbEditorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        cbEditorial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EDITORIAL DEL LIBRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        cbClase.setBackground(new java.awt.Color(50, 47, 61));
        cbClase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbClase.setForeground(new java.awt.Color(255, 255, 255));
        cbClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programación", "Análisis", "Diseño" }));
        cbClase.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CATEGORIA DEL LIBRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEditorial, 0, 285, Short.MAX_VALUE)
                    .addComponent(cbClase, 0, 285, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 309, 150));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 93, 103), 2));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregar.setToolTipText("Agregar los datos del libro");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setToolTipText("Salir del programa");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEstadistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estadistica.png"))); // NOI18N
        btnEstadistica.setToolTipText("Estadisticas");
        btnEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticaActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        btnEditar.setToolTipText("Editar los datos del libro");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar los datos del libro seleccionado");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnSalir)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEstadistica)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 67, -1, 316));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 93, 103), 2));

        listNombre.setForeground(new java.awt.Color(255, 255, 255));
        listNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listNombreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listNombre);

        listAño.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(listAño);

        listClase.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(listClase);

        listPaginas.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(listPaginas);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo de pantalla de paraiso de agua 15_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 740, 400));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try 
        {
            CapturarDatos();
            ListarDatos();
            txtNombre.requestFocus();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos del libro");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Validar.Salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Validar.LetrasTyped(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
        Validar.NumerosTyped(evt, 4, txtAño);
    }//GEN-LAST:event_txtAñoKeyTyped

    private void txtPaginasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaginasKeyTyped
        Validar.NumerosTyped(evt, 3, txtPaginas);
    }//GEN-LAST:event_txtPaginasKeyTyped

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        Validar.NumerosDoubleTyped(evt, 5, txtCosto);
    }//GEN-LAST:event_txtCostoKeyTyped

    private void btnAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatorioActionPerformed
        AleatorioDatos();
    }//GEN-LAST:event_btnAleatorioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(lista.Tamaño()==0)
        {
            JOptionPane.showMessageDialog(null, "No existe elementos en la lista de libros");
        }
        else
        {
            
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticaActionPerformed
        try 
        {
            Estadistica();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"No hay Datos");
        }
    }//GEN-LAST:event_btnEstadisticaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(lista.Tamaño()==0)
        {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        else
        {
            editar=true;
            eliminar=false;
            JOptionPane.showMessageDialog(null, "Primero rellena los dato");
            JOptionPane.showMessageDialog(null, "Despues selecciona el nombre del libro");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(lista.Tamaño()==0)
        {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        else
        {
            eliminar=true;
            editar=false;
            JOptionPane.showMessageDialog(null, "Elige el nombre del libro que desea eliminar");
        }    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
        lista.ReiniciarArreglo();
        ListarDatos();
    }//GEN-LAST:event_btnAgregar3ActionPerformed

    private void listNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listNombreMouseClicked
        if (evt.getClickCount() == 2)
        {
            int posicionCLICK = listNombre.locationToIndex(evt.getPoint());
            if(eliminar==true)
            {
                if(lista.Tamaño()==0)
                {
                    JOptionPane.showMessageDialog(null, "La lista esta vacia");
                }
                else
                {
                    lista.Eliminar(posicionCLICK);
                    ListarDatos();
                    eliminar=false;
                } 
            }
            if(editar==true)
            {  
                if(lista.Tamaño()==0)
                {
                    JOptionPane.showMessageDialog(null, "La lista esta vacia");
                }
                else
                {
                    Libro libro = new Libro(CapturarNombre(), CapturarEditorial(), CapturarClase(), CapturarAño(), CapturarPaginas(), CapturarCosto());
                    lista.Editar(posicionCLICK,libro);
                    LimpiarCampos();
                    ListarDatos();
                    editar=false;
                }    
            }
        }
    }//GEN-LAST:event_listNombreMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnAleatorio;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEstadistica;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbClase;
    private javax.swing.JComboBox<String> cbEditorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JList<String> listAño;
    private javax.swing.JList<String> listClase;
    private javax.swing.JList<String> listCosto;
    private javax.swing.JList<String> listEditorial;
    private javax.swing.JList<String> listNombre;
    private javax.swing.JList<String> listPaginas;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaginas;
    // End of variables declaration//GEN-END:variables
}
