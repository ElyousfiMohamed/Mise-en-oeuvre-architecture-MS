<img src="./screens/topo_readme.jpg"/>
<h1 align="center">Mohamed ELYOUSFI</h1>
<h3 align="center"><💻 Mise en oeuvre d'une architecture Micro-Services 💻/></h3><br><br>

<div>
    <p>
        <a href="">📌 Notes de cours</a>
        <h5>Selected Dependencies</h5>
        <ul>
            <li>
                Spring Web.
            </li>
            <li>
                Spring Data JPA.
            </li>
            <li>
                H2 Database.
            </li>
            <li>
                Rest Repositories.
            </li>
            <li>
                Lombok.
            </li>
            <li>
                Spring Boot DevTools.
            </li>
            <li>
                Eureka Discovery Client.
            </li>
            <li>
                Spring Cloud OpenFeign.
            </li>
            <li>
                Spring Boot Actuator : let you monitor and manage your application
            </li>
            <li>
                Mapstruct.
            </li>
            <li>
                Swagger-Ui.
            </li>
        </ul> 
        <h3> 📌 Architecture Micro-Services </h3>
        <img src="./screens/arch.png"/>
        <details>
        <summary style="font-size:20px;cursor:pointer">1. CUSTOMER-SERVICE (Click to expand 🖱)</summary>
        <h5>1.1. Création de l'entité Customer</h5>
        <img src="./screens/Screenshot_1.png" width="700"/>
        <h5>1.1. Création du repository Customer</h5>
        <img src="./screens/Screenshot_2.png" width="700"/>
        <h5>1.2. Création du CustomerRequestDTO</h5>
        <img src="./screens/Screenshot_3.png" width="700"/>
        <h5>1.3. Création du CustomerResponseDTO</h5>
        <img src="./screens/Screenshot_4.png" width="700"/>
        <h5>1.4. Création du CustomerMapper</h5>
        <img src="./screens/Screenshot_5.png" width="700"/>
        <h5>1.5. Création du CustomerService et Impl</h5>
        <img src="./screens/Screenshot_6.png" width="700"/>
        <img src="./screens/Screenshot_7.png" width="700"/>
        <img src="./screens/Screenshot_8.png" width="700"/>
        <h5>1.6. Création du CustomerController</h5>
        <img src="./screens/Screenshot_9.png" width="700"/>
        <h5>1.7. Insertion des données de test</h5>
        <img src="./screens/Screenshot_10.png" width="700"/>
        <img src="./screens/Screenshot_11.png" width="700"/>
        <img src="./screens/Screenshot_12.png" width="700"/>
        <h5>1.8. Monitoring du MS</h5>
        <img src="./screens/Screenshot_13.png" width="700"/>
        <h5>1.9. Swagger</h5>
        <h6>Documentation de l'API</h6>
        <img src="./screens/Screenshot_14.png" width="700"/>
        <h6>Test de l'API - getAllCustomers</h6>
        <img src="./screens/Screenshot_15.png" width="700"/>
        <h6>Test de l'API - addCustomer</h6>
        <img src="./screens/Screenshot_16.png" width="700"/>
        <img src="./screens/Screenshot_17.png" width="700"/>
        </details>
        <details>
        <summary style="font-size:20px;cursor:pointer">2. BILLING-SERVICE (Click to expand 🖱)</summary>
        <h5>2.1. Création de l'entité Invoice et Customer</h5>
        <img src="./screens/Screenshot_18.png" width="700"/>
        <img src="./screens/Screenshot_19.png" width="700"/>
        <h5>2.2. Création du repository Invoice</h5>
        <img src="./screens/Screenshot_20.png" width="700"/>
        <h5>2.3. Création du InvoiceRequestDTO</h5>
        <img src="./screens/Screenshot_21.png" width="700"/>
        <h5>2.4. Création du InvoiceResponseDTO</h5>
        <img src="./screens/Screenshot_22.png" width="700"/>
        <h5>2.5. Création du InvoiceMapper</h5>
        <img src="./screens/Screenshot_23.png" width="700"/>
        <h5>2.6. Création du InvoiceService et Impl</h5>
        <img src="./screens/Screenshot_24.png" width="700"/>
        <img src="./screens/Screenshot_25.png" width="700"/>
        <img src="./screens/Screenshot_26.png" width="700"/>
        <img src="./screens/Screenshot_27.png" width="700"/>
        <h5>2.7. Création du InvoiceController</h5>
        <img src="./screens/Screenshot_28.png" width="700"/>
        <h5>2.8. Insertion des données de test</h5>
        <img src="./screens/Screenshot_29.png" width="700"/>
        <img src="./screens/Screenshot_30.png" width="700"/>
        <img src="./screens/Screenshot_31.png" width="700"/>
        <h5>2.9. Monitoring du MS</h5>
        <img src="./screens/Screenshot_32.png" width="700"/>
        <h5>2.10. Swagger</h5>
        <h6>Documentation de l'API</h6>
        <img src="./screens/Screenshot_33.png" width="700"/>
        <h6>Test de l'API - getAllInvoices</h6><br>
        <img src="./screens/Screenshot_34.png" width="700"/>
        <h6>Test de l'API - getInvoiceById</h6><br>
        <img src="./screens/Screenshot_35.png" width="700"/>
        </details>
        <details>
        <summary style="font-size:20px;cursor:pointer">3. DISCOVERY-SERVICE (Click to expand 🖱)</summary>
        <h5>3.1. Création du CustomerRestClient avec OpenFeign</h5>
        <img src="./screens/Screenshot_36.png" width="700"/>
        <h5>3.2. Enable Eureka Server</h5>
        <img src="./screens/Screenshot_37.png" width="700"/>
        <img src="./screens/Screenshot_38.png" width="700"/><br>
        <b>avant le démarrage des services Customer et Invoice</b><br>
        <img src="./screens/Screenshot_39.png" width="700"/><br>
        <b>après le démarrage des services Customer et Invoice</b><br>
        <img src="./screens/Screenshot_40.png" width="700"/>
        <img src="./screens/Screenshot_41.png" width="700"/>
        </details>
        <details>
        <summary style="font-size:20px;cursor:pointer">4. GATEWAY-SERVICE (Click to expand 🖱)</summary>
        <h5>4.1. Dynamic routes configuration avec Discovery Service</h5>
        <img src="./screens/Screenshot_43.png" width="700"/>
        <img src="./screens/Screenshot_42.png" width="700"/><br>
        <b>aprés le démarrage de la Gateway</b><br>
        <img src="./screens/Screenshot_44.png" width="700"/><br>
        <b>Accés au BILLING-SERVICE à partir du Gateway</b><br>
        <img src="./screens/Screenshot_46.png" width="700"/><br>
        <b>Accés au CUSTOMER-SERVICE à partir du Gateway</b><br>
        <img src="./screens/Screenshot_45.png" width="700"/><br>
        <b>Ajout d'une facture à partir du Gateway</b><br>
        <img src="./screens/Screenshot_47.png" width="700"/>
        </details>
        <details>
        <summary style="font-size:20px;cursor:pointer">5. DEPLOY THE MICROSERVICES (Click to expand 🖱) </summary>
        <h5>5.1. DiscoveryService</h5><br>
        <i>- Création du Dockerfile</i><br>
        <img src="./screens/Screenshot_48.png" width="700"/><br>
        <i>- Génération du fichier jar</i><br>
        <img src="./screens/Screenshot_49.png" width="700"/><br>
        <i>- Build de l'image Docker</i><br>
        <img src="./screens/Screenshot_52.png" width="700"/><br>
        <img src="./screens/Screenshot_53.png" width="700"/>
        <h5>5.2. GatewayService</h5><br>
        <i>- Création du Dockerfile & jar</i><br>
        <img src="./screens/Screenshot_51.png" width="700"/><br>
        <i>- Build de l'image Docker</i><br>
        <img src="./screens/Screenshot_54.png" width="700"/><br>
        <img src="./screens/Screenshot_55.png" width="700"/>
        <h5>5.3. CustomerService</h5><br>
        <i>- Création du Dockerfile</i><br>
        <img src="./screens/Screenshot_50.png" width="700"/><br>
        <i>- Génération du fichier jar</i><br>
        <img src="./screens/Screenshot_56.png" width="700"/><br>
        <i>- Build de l'image Docker</i><br>
        <img src="./screens/Screenshot_57.png" width="700"/><br>
        <img src="./screens/Screenshot_58.png" width="700"/>
        <h5>5.4. BillingService</h5>
        <i>- Création du Dockerfile & jar</i><br>
        <img src="./screens/Screenshot_59.png" width="700"/><br>
        <i>- Build de l'image Docker</i><br>
        <img src="./screens/Screenshot_60.png" width="700"/><br>
        <img src="./screens/Screenshot_61.png" width="700"/>
        <h5>5.5. Pushing images into repositories</h5>
        <img src="./screens/Screenshot_62.png" width="700"/>
        <h5>5.6. Create deployements with Minikube</h5>
        <img src="./screens/Screenshot_65.png" width="700"/>
        <img src="./screens/Screenshot_66.png" width="700"/>
        <img src="./screens/Screenshot_63.png" width="700"/>
        <h5>5.7. Test the microservices (En cours)</h5>
        </details>

        
</div>

<!-- <img src="./screens/rodape_readme.jpg" alt="Art for footer readme.md" /> -->
