/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.locationmodel.standard.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Enumeration} with << GeographicalRegion >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("840d6f54-3cb7-4c64-bc4c-8a2ef6fc0cd4")
public class GeographicalRegion extends Location {
    @objid ("42e04f9e-b78d-4e7a-8f96-fac447c3ae46")
    public static final String STEREOTYPE_NAME = "GeographicalRegion";

    /**
     * Tells whether a {@link GeographicalRegion proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << GeographicalRegion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("234a2ec2-98f0-481d-ae9c-42f139177a79")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, GeographicalRegion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << GeographicalRegion >> then instantiate a {@link GeographicalRegion} proxy.
     * 
     * @return a {@link GeographicalRegion} proxy on the created {@link Enumeration}.
     */
    @objid ("b41aad50-75a4-4c8d-9d82-c30d77cb0f04")
    public static GeographicalRegion create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Enumeration");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, GeographicalRegion.STEREOTYPE_NAME);
        return GeographicalRegion.instantiate((Enumeration)e);
    }

    /**
     * Tries to instantiate a {@link GeographicalRegion} proxy from a {@link Enumeration} stereotyped << GeographicalRegion >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Enumeration
     * @return a {@link GeographicalRegion} proxy or <i>null</i>.
     */
    @objid ("ae2b0d71-53ca-4261-bd07-28799ec42d31")
    public static GeographicalRegion instantiate(final Enumeration obj) {
        return GeographicalRegion.canInstantiate(obj) ? new GeographicalRegion(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GeographicalRegion} proxy from a {@link Enumeration} stereotyped << GeographicalRegion >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Enumeration}
     * @return a {@link GeographicalRegion} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e78293d0-132b-47b6-87a9-adcf612b3184")
    public static GeographicalRegion safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (GeographicalRegion.canInstantiate(obj))
        	return new GeographicalRegion(obj);
        else
        	throw new IllegalArgumentException("GeographicalRegion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'parentRegions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f81136d6-babd-46a4-8e41-d06d5c342e6c")
    public void addParentRegions(final GeographicalRegion obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, GeographicalRegion.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(GeographicalRegion.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("5ab8fde9-fb25-4c32-8e6b-11b606260162")
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
        GeographicalRegion other = (GeographicalRegion) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Enumeration}. 
     * @return the Enumeration represented by this proxy, never null.
     */
    @objid ("1da4154e-67dd-4975-b40a-b6edcb58c0c9")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Get the values of the 'parentRegions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f3e6809d-da94-456b-a996-fcd99f3dfc7a")
    public List<GeographicalRegion> getParentRegions() {
        List<GeographicalRegion> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(GeographicalRegion.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(GeographicalRegion.MdaTypes.MDAASSOCDEP_ROLE), "")
              && GeographicalRegion.canInstantiate(d.getImpacted())) {
                 results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getImpacted(), GeographicalRegion.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("626f5148-6bb2-483e-9762-cd0be397d5ee")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'parentRegions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0bc6aa8a-0de1-4786-bef7-416b530a9e01")
    public boolean removeParentRegions(final GeographicalRegion obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(GeographicalRegion.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(GeographicalRegion.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("aa3fc52a-2ac6-4b14-82a7-eeb9721ce8fe")
    public boolean addAlternativeName(String name) {
        if (this.getAlternativeNames().contains(name)){
            return false;
        }else {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            session.getModel().createEnumerationLiteral(name, getElement());
            return true;
        }
    }

    @objid ("1284509b-ae5a-45ad-971b-d975b44f9b21")
    public List<String> getAlternativeNames() {
        List<String> names = new ArrayList<>();
        for (EnumerationLiteral literal : this.getElement().getValue()) {
            names.add(literal.getName());
        }
        return names;
    }

    @objid ("624d0857-99f9-429b-98e2-565a6e6bf25e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("06fb37c4-dc44-43b8-a231-0119d1882fab")
    public boolean removeAlternativeName(String name) {
        for (EnumerationLiteral literal : this.getElement().getValue()) {
            if (literal.getName().equals(name)) {
                literal.delete();
                return true;
            }
        }
        return false;
    }

    @objid ("9fdfe35c-776c-442f-89e9-70397be357fd")
    protected GeographicalRegion(final Enumeration elt) {
        super(elt);
    }

    @objid ("99a544e5-32ff-4e49-b598-8e15beae3213")
    public static final class MdaTypes {
        @objid ("495b1065-2aaa-4225-9dc2-2e6788e61bc2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("adc400eb-afb8-4e91-bd76-e6b251803475")
        private static Stereotype MDAASSOCDEP;

        @objid ("328dec1c-2af8-4759-ac0b-6a606b0e0825")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b41d45de-6984-43e0-afc5-ebf42eacf533")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b9be9f56-5f88-4cfb-8745-3fe2ceda1c86");
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
