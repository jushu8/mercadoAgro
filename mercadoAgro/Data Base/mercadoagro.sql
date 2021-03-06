PGDMP     $            
        z            mercadoagro    14.1    14.1 !                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            !           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            "           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            #           1262    16552    mercadoagro    DATABASE     j   CREATE DATABASE mercadoagro WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Colombia.1252';
    DROP DATABASE mercadoagro;
                postgres    false            ?            1259    16553    cliente    TABLE       CREATE TABLE public.cliente (
    cedula_cliente integer NOT NULL,
    nombre1_cliente text,
    nombre2_cliente text NOT NULL,
    apellido1_cliente text,
    apellido2_cliente text NOT NULL,
    telefono_cliente numeric,
    correo_cliente text NOT NULL,
    direccion_cliente text
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            ?            1259    16620    detalle_venta    TABLE     ?   CREATE TABLE public.detalle_venta (
    id_venta integer,
    id_producto integer,
    cantidad_venta integer,
    valor_detalle integer
);
 !   DROP TABLE public.detalle_venta;
       public         heap    postgres    false            ?            1259    16581    empleado    TABLE     (  CREATE TABLE public.empleado (
    cedula_empleado integer NOT NULL,
    nombre1_empleado text,
    nombre2_empleado text NOT NULL,
    apellido1_empleado text,
    apellido2_empleado text NOT NULL,
    telefono_empleado integer,
    correo_empleado text NOT NULL,
    direccion_empleado text
);
    DROP TABLE public.empleado;
       public         heap    postgres    false            ?            1259    16567    familia    TABLE     x   CREATE TABLE public.familia (
    id_familia integer NOT NULL,
    nombre_familia text,
    descripcion_familia text
);
    DROP TABLE public.familia;
       public         heap    postgres    false            ?            1259    16588    producto    TABLE       CREATE TABLE public.producto (
    id_producto integer NOT NULL,
    nombre_producto text,
    descripcion_producto text,
    id_familia integer,
    nit_provedor integer,
    existencia_producto integer,
    stock_minimo_producto integer,
    valor_producto integer
);
    DROP TABLE public.producto;
       public         heap    postgres    false            ?            1259    16574 	   proveedor    TABLE     ?   CREATE TABLE public.proveedor (
    nit_proveedor integer NOT NULL,
    nombre_proveedor text,
    correo_proveedor text,
    telefono_proveedor integer,
    direccion_proveedor text
);
    DROP TABLE public.proveedor;
       public         heap    postgres    false            ?            1259    16560    usuario    TABLE     p   CREATE TABLE public.usuario (
    id_usuario integer NOT NULL,
    tipo_usuario text,
    clave_usuario text
);
    DROP TABLE public.usuario;
       public         heap    postgres    false            ?            1259    16605    venta    TABLE     ?   CREATE TABLE public.venta (
    id_venta integer NOT NULL,
    fecha_venta date,
    valortotal_venta integer,
    cedula_cliente integer,
    cedula_empleado integer
);
    DROP TABLE public.venta;
       public         heap    postgres    false                      0    16553    cliente 
   TABLE DATA           ?   COPY public.cliente (cedula_cliente, nombre1_cliente, nombre2_cliente, apellido1_cliente, apellido2_cliente, telefono_cliente, correo_cliente, direccion_cliente) FROM stdin;
    public          postgres    false    209   ?(                 0    16620    detalle_venta 
   TABLE DATA           ]   COPY public.detalle_venta (id_venta, id_producto, cantidad_venta, valor_detalle) FROM stdin;
    public          postgres    false    216   ?(                 0    16581    empleado 
   TABLE DATA           ?   COPY public.empleado (cedula_empleado, nombre1_empleado, nombre2_empleado, apellido1_empleado, apellido2_empleado, telefono_empleado, correo_empleado, direccion_empleado) FROM stdin;
    public          postgres    false    213   ?(                 0    16567    familia 
   TABLE DATA           R   COPY public.familia (id_familia, nombre_familia, descripcion_familia) FROM stdin;
    public          postgres    false    211   
)                 0    16588    producto 
   TABLE DATA           ?   COPY public.producto (id_producto, nombre_producto, descripcion_producto, id_familia, nit_provedor, existencia_producto, stock_minimo_producto, valor_producto) FROM stdin;
    public          postgres    false    214   ')                 0    16574 	   proveedor 
   TABLE DATA              COPY public.proveedor (nit_proveedor, nombre_proveedor, correo_proveedor, telefono_proveedor, direccion_proveedor) FROM stdin;
    public          postgres    false    212   D)                 0    16560    usuario 
   TABLE DATA           J   COPY public.usuario (id_usuario, tipo_usuario, clave_usuario) FROM stdin;
    public          postgres    false    210   a)                 0    16605    venta 
   TABLE DATA           i   COPY public.venta (id_venta, fecha_venta, valortotal_venta, cedula_cliente, cedula_empleado) FROM stdin;
    public          postgres    false    215   ~)       ?           2606    16587    empleado empleado_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_pkey PRIMARY KEY (cedula_empleado);
 @   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_pkey;
       public            postgres    false    213            |           2606    16573    familia familia_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.familia
    ADD CONSTRAINT familia_pkey PRIMARY KEY (id_familia);
 >   ALTER TABLE ONLY public.familia DROP CONSTRAINT familia_pkey;
       public            postgres    false    211            ?           2606    16594    producto producto_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT producto_pkey PRIMARY KEY (id_producto);
 @   ALTER TABLE ONLY public.producto DROP CONSTRAINT producto_pkey;
       public            postgres    false    214            ~           2606    16580    proveedor proveedor_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.proveedor
    ADD CONSTRAINT proveedor_pkey PRIMARY KEY (nit_proveedor);
 B   ALTER TABLE ONLY public.proveedor DROP CONSTRAINT proveedor_pkey;
       public            postgres    false    212            x           2606    16559    cliente usuario_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (cedula_cliente);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT usuario_pkey;
       public            postgres    false    209            z           2606    16566    usuario usuario_pkey1 
   CONSTRAINT     [   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey1 PRIMARY KEY (id_usuario);
 ?   ALTER TABLE ONLY public.usuario DROP CONSTRAINT usuario_pkey1;
       public            postgres    false    210            ?           2606    16609    venta venta_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT venta_pkey PRIMARY KEY (id_venta);
 :   ALTER TABLE ONLY public.venta DROP CONSTRAINT venta_pkey;
       public            postgres    false    215            ?           2606    16610    venta cedula_cliente_venta    FK CONSTRAINT     ?   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT cedula_cliente_venta FOREIGN KEY (cedula_cliente) REFERENCES public.cliente(cedula_cliente);
 D   ALTER TABLE ONLY public.venta DROP CONSTRAINT cedula_cliente_venta;
       public          postgres    false    215    209    3192            ?           2606    16615    venta cedula_empleado_venta    FK CONSTRAINT     ?   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT cedula_empleado_venta FOREIGN KEY (cedula_empleado) REFERENCES public.empleado(cedula_empleado);
 E   ALTER TABLE ONLY public.venta DROP CONSTRAINT cedula_empleado_venta;
       public          postgres    false    213    3200    215            ?           2606    16595    producto id_familia_producto    FK CONSTRAINT     ?   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT id_familia_producto FOREIGN KEY (id_familia) REFERENCES public.familia(id_familia);
 F   ALTER TABLE ONLY public.producto DROP CONSTRAINT id_familia_producto;
       public          postgres    false    3196    214    211            ?           2606    16628 '   detalle_venta id_producto_detalle_venta    FK CONSTRAINT     ?   ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT id_producto_detalle_venta FOREIGN KEY (id_producto) REFERENCES public.producto(id_producto);
 Q   ALTER TABLE ONLY public.detalle_venta DROP CONSTRAINT id_producto_detalle_venta;
       public          postgres    false    214    3202    216            ?           2606    16623 $   detalle_venta id_venta_detalle_venta    FK CONSTRAINT     ?   ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT id_venta_detalle_venta FOREIGN KEY (id_venta) REFERENCES public.venta(id_venta);
 N   ALTER TABLE ONLY public.detalle_venta DROP CONSTRAINT id_venta_detalle_venta;
       public          postgres    false    216    215    3204            ?           2606    16600    producto nit_proveedor_producto    FK CONSTRAINT     ?   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT nit_proveedor_producto FOREIGN KEY (nit_provedor) REFERENCES public.proveedor(nit_proveedor);
 I   ALTER TABLE ONLY public.producto DROP CONSTRAINT nit_proveedor_producto;
       public          postgres    false    212    214    3198                  x?????? ? ?            x?????? ? ?            x?????? ? ?            x?????? ? ?            x?????? ? ?            x?????? ? ?            x?????? ? ?            x?????? ? ?     