/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << SecurityModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("558acef6-15e9-4032-97b3-66eea7c497d6")
public class SecurityModel extends SubModel {
<<<<<<< HEAD
    @objid ("628f9d96-bb23-4959-bbbb-884119fa62ca")
=======
    @objid ("76b019c4-b3a2-46a2-b260-eda5fec84dbd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "SecurityModel";

    /**
     * Tells whether a {@link SecurityModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << SecurityModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("bf8ef123-1d7a-46b3-84f4-c6af31323d82")
=======
    @objid ("2e925eb0-64ce-4a58-b13d-1b36820ad7c6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << SecurityModel >> then instantiate a {@link SecurityModel} proxy.
     * 
     * @return a {@link SecurityModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("9739e0b1-442f-417e-a38a-bc7f04a0d531")
=======
    @objid ("7ad009f8-9180-44ac-b44f-431e37554031")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityModel.STEREOTYPE_NAME);
        return SecurityModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link SecurityModel} proxy from a {@link Package} stereotyped << SecurityModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link SecurityModel} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("acdf12ca-a0bb-4dcc-9b3e-7deb5eace270")
=======
    @objid ("0082b383-90b0-48cc-b26d-14ebe12c515e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityModel instantiate(final Package obj) {
        return SecurityModel.canInstantiate(obj) ? new SecurityModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityModel} proxy from a {@link Package} stereotyped << SecurityModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link SecurityModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("c327207c-d4e6-4329-bf55-6464888e2d33")
=======
    @objid ("f4ab540a-a888-4c2a-a5a9-48484c6a1108")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (SecurityModel.canInstantiate(obj))
        	return new SecurityModel(obj);
        else
        	throw new IllegalArgumentException("SecurityModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'compositeSecurityInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("925adaf1-e683-4853-b254-82701b81f500")
=======
    @objid ("833d3d57-b459-4d30-8abe-86241e4116bf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addCompositeSecurityInstances(final CompositeSecurityMetric obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f23d77b9-809e-4dce-8011-11aaf038169a")
=======
    @objid ("977339a3-fb88-46e8-a580-2eb3d2fba028")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final SecurityModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("54207c55-cae3-4058-8c5a-37cdf13cdb4c")
=======
    @objid ("d795afa1-152e-4925-ab0b-3ab5d387e491")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addRawSecurityMetrics(final RawSecurityMetric obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityAttributes' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("eee0c43e-969e-489c-b28f-a45c103e2d76")
=======
    @objid ("0f48452d-782a-4696-a59f-3d6298474159")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSecurityAttributes(final SecurityAttribute obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("117a447c-a95b-4581-8c4c-60d5fb7a34aa")
=======
    @objid ("984673f6-e81a-4cb2-894d-d1e08aec7de2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSecurityControls(final SecurityControl obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityDomains' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("99049d85-99cd-4a2e-a0eb-47903fad4a33")
=======
    @objid ("ab28ff80-fea9-426c-b585-e637dcbc7308")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSecurityDomains(final SecurityDomain obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("17f15bfe-86a4-4d9a-ada2-fb64e49fa139")
=======
    @objid ("056215dd-f656-4a09-8eb2-cde741bebf03")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSecurityMetricInstances(final SecurityMetricInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityRequirements' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("3e1df178-382f-487c-8e79-1864c398ca9f")
=======
    @objid ("984c3026-0e47-4c65-9f8d-864ccc52fb19")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSecurityRequirements(final SecurityRequirement obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securitySLOs' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("c4d0bdc0-481b-46af-ad5f-469ec63e91e9")
=======
    @objid ("afc5377d-966c-47d0-8ba8-472ba3bf077d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSecuritySLOs(final SecuritySLO obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("c2c37295-e110-4114-8b18-a208e77e1fc0")
=======
    @objid ("a8794c44-be69-4a9a-bf7c-0cf59add6685")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SecurityModel other = (SecurityModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("000d705c-4bce-46c8-9bb6-8555d76ba24d")
=======
    @objid ("2ebfe90a-09a0-4f4a-bbcc-07bc8a647ab5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'compositeSecurityInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("3b209f4a-a5ab-4ccf-b7d4-5a53c5d07a40")
=======
    @objid ("1a82d393-9584-4d20-a8c7-fbf659563896")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<CompositeSecurityMetric> getCompositeSecurityInstances() {
        List<CompositeSecurityMetric> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (CompositeSecurityMetric.canInstantiate(mObj))
        			results.add((CompositeSecurityMetric)CamelDesignerProxyFactory.instantiate(mObj, CompositeSecurityMetric.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("07171aa7-3c10-44bf-863b-87c1969aeec8")
=======
    @objid ("d96363fa-3b29-46bc-a376-733b23807b02")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<SecurityModelDiagram> getDiagrams() {
        List<SecurityModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (SecurityModelDiagram.canInstantiate(mObj))
        			results.add((SecurityModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, SecurityModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("2c01b7cc-5eca-4f7a-86fc-d51783f524a1")
=======
    @objid ("28109352-ca84-4a0e-8831-28987adf4753")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("7d38e1e8-4936-40f1-9de8-bd908b7935d5")
=======
    @objid ("39e7e5be-8366-4392-b4f9-55116c7783bb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<RawSecurityMetric> getRawSecurityMetrics() {
        List<RawSecurityMetric> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (RawSecurityMetric.canInstantiate(mObj))
        			results.add((RawSecurityMetric)CamelDesignerProxyFactory.instantiate(mObj, RawSecurityMetric.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityAttributes' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("6b0b8a12-22c2-456e-aadd-baa3543d3fe4")
=======
    @objid ("aa9b5a45-8ae1-4caf-af16-64c5003e3442")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<SecurityAttribute> getSecurityAttributes() {
        List<SecurityAttribute> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Certifiable.canInstantiate(mObj))
        			results.add((Certifiable)CamelDesignerProxyFactory.instantiate(mObj, Certifiable.STEREOTYPE_NAME));
        	if (SecurityAttribute.canInstantiate(mObj))
        			results.add((SecurityAttribute)CamelDesignerProxyFactory.instantiate(mObj, SecurityAttribute.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d162abfc-abbf-42d2-970f-4c18b0c13bde")
=======
    @objid ("94f6c9f7-0876-4af7-805b-622e2f9edc04")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<SecurityControl> getSecurityControls() {
        List<SecurityControl> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SecurityControl.canInstantiate(mObj))
        			results.add((SecurityControl)CamelDesignerProxyFactory.instantiate(mObj, SecurityControl.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityDomains' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("6718413c-a1c6-44d8-9b96-92b4f17f1c2a")
=======
    @objid ("82ffef83-f774-4568-87c7-ef4cac11844d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<SecurityDomain> getSecurityDomains() {
        List<SecurityDomain> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SecurityDomain.canInstantiate(mObj))
        			results.add((SecurityDomain)CamelDesignerProxyFactory.instantiate(mObj, SecurityDomain.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("cdef6adb-3fed-40cb-bb05-e19e141b6fe9")
=======
    @objid ("3f7e1f79-9a25-4694-a6d1-fa1229eec9ec")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<SecurityMetricInstance> getSecurityMetricInstances() {
        List<SecurityMetricInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (SecurityMetricInstance.canInstantiate(mObj))
        			results.add((SecurityMetricInstance)CamelDesignerProxyFactory.instantiate(mObj, SecurityMetricInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityRequirements' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("1ef85fd9-c053-4c50-85f2-827c20ccba15")
=======
    @objid ("89cc5fa3-031f-4539-a703-09302259218c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<SecurityRequirement> getSecurityRequirements() {
        List<SecurityRequirement> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SecurityRequirement.canInstantiate(mObj))
        			results.add((SecurityRequirement)CamelDesignerProxyFactory.instantiate(mObj, SecurityRequirement.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securitySLOs' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("027456f6-727c-4b0a-a111-cf4fe36d3374")
=======
    @objid ("45f71841-f182-4161-a907-de0270f5bdce")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<SecuritySLO> getSecuritySLOs() {
        List<SecuritySLO> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SecuritySLO.canInstantiate(mObj))
        			results.add((SecuritySLO)CamelDesignerProxyFactory.instantiate(mObj, SecuritySLO.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("171385be-01b7-444b-bfa5-d7bfab40d69f")
=======
    @objid ("b3d6a406-9a80-4cbf-90f7-bfd5c915786e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'compositeSecurityInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("30a718af-cf57-4cd8-8c4e-e552f11c051c")
=======
    @objid ("813f0002-b9a3-4018-93d2-da239b702169")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeCompositeSecurityInstances(final CompositeSecurityMetric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4757482d-aef0-48ac-888b-33678e85ab1d")
=======
    @objid ("7f712e85-cb78-4da5-8e54-9fccea8cb516")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final SecurityModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a157d5b8-9ba0-4afe-8d42-f1bec59ccb64")
=======
    @objid ("b08f0466-fdb9-4162-9bc4-7a7d50679f00")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRawSecurityMetrics(final RawSecurityMetric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityAttributes' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("182a674b-b0ba-44db-8754-7099adcdf2ba")
=======
    @objid ("0992f50c-1137-4265-8c8d-9c573d01bc02")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSecurityAttributes(final SecurityAttribute obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("940f04bd-482b-4184-8b51-b14eb6be6c9a")
=======
    @objid ("72167df7-cec0-459d-80cc-57a2bee0a569")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSecurityControls(final SecurityControl obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityDomains' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ddd20379-016c-434e-bf8e-b42569a7e889")
=======
    @objid ("9ec2de4e-7153-4c95-ad2b-d5572ceea9de")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSecurityDomains(final SecurityDomain obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("46a0aac5-0b8b-474b-8bbf-791bb700eac7")
=======
    @objid ("71973b8a-3066-4edb-a3b7-5fd07772e2cf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSecurityMetricInstances(final SecurityMetricInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityRequirements' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b1100ed9-4ab1-4004-b393-9aaf6f3fb1d3")
=======
    @objid ("216790d6-3782-41e6-a632-7e4298867f76")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSecurityRequirements(final SecurityRequirement obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securitySLOs' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("314a1b73-cf8a-46b9-a000-d33fe9935029")
=======
    @objid ("4191c62f-c6e8-49db-a8a0-6a19d94ad1f7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSecuritySLOs(final SecuritySLO obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("29d39253-0bd4-4a97-a8a9-2c8f305cdb35")
=======
    @objid ("5ca8155d-c84a-4ea7-a424-d95901758ec9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("d6494135-6e9c-4ee4-a29e-8acb056b462c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getSecurityControls());
        result.addAll(getSecurityRequirements());
        result.addAll(getSecurityAttributes());
        result.addAll(getRawSecurityMetrics());
        result.addAll(getCompositeSecurityInstances());
        result.addAll(getSecurityMetricInstances());
        result.addAll(getSecurityDomains());
        result.addAll(getSecuritySLOs());
        return result;
    }

<<<<<<< HEAD
    @objid ("df134184-34df-4041-9d66-d7827a611777")
=======
    @objid ("0c95dec5-1c2a-4b5b-b784-e1f10cc65979")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SecurityModel(final Package elt) {
        super(elt);
    }

    @objid ("2405f496-8209-4c75-b1e1-0df64f112617")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("3d329bea-0148-44e4-bc15-5a01a035fbd3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("45611294-43cd-4e50-8fcc-ad40a9742a7a")
        private static Stereotype MDAASSOCDEP;

        @objid ("16a94fe7-cfaa-4946-ad5a-b1ef35ca10ef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("81ea6f69-9ffb-423e-88d3-542b49e3b448")
=======
        @objid ("fe87d055-fd2f-4912-a614-48d75d94b07e")
        private static Stereotype MDAASSOCDEP;

        @objid ("67487354-9703-48e0-a020-f91f49be7ad3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("17da16e6-69c5-4e2a-895e-2444e86b673d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2353304e-ef8d-4b60-9d26-4687971056d4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "61f4f16b-0ac0-4a06-a279-b5b28dc86d01");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
