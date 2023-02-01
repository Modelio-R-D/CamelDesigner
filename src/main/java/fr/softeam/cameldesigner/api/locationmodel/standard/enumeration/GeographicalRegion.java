/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f2fe5d09-3280-446a-b91a-ff62da2a2acf")
=======
    @objid ("9162627d-1b3c-4756-a694-be4fd31b8ae5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "GeographicalRegion";

    /**
     * Tells whether a {@link GeographicalRegion proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << GeographicalRegion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("975a0765-8bcd-4e24-aaed-5d0f40315acc")
=======
    @objid ("e72db3af-8f8b-4c84-86b3-ff486f14208f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, GeographicalRegion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << GeographicalRegion >> then instantiate a {@link GeographicalRegion} proxy.
     * 
     * @return a {@link GeographicalRegion} proxy on the created {@link Enumeration}.
     */
<<<<<<< HEAD
    @objid ("296b1ca5-4526-4f8f-b752-9b4c80dce481")
=======
    @objid ("390001b2-8307-41b0-a72a-d3c912ebe766")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("aa04e558-61f3-484c-b484-f2b940c6e42e")
=======
    @objid ("0d01c5a3-133b-4deb-9327-cd5972d3da1b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4ae88a8e-3ec4-48f3-9c6c-c42d26c5c23f")
=======
    @objid ("3c504e5b-5bbd-47f6-b618-14b6e963aa13")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3e3cbd4e-5f54-4187-b3af-43f93eabf03a")
=======
    @objid ("a01a0f49-34e9-4601-a449-21881f44d4b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addParentRegions(final GeographicalRegion obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, GeographicalRegion.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(GeographicalRegion.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

<<<<<<< HEAD
    @objid ("8236c55e-11c3-4271-925d-fd2602781b03")
=======
    @objid ("b6d67c94-cbed-43c9-8270-9a64daf200fb")
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
        GeographicalRegion other = (GeographicalRegion) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Enumeration}. 
     * @return the Enumeration represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("13cb177c-4499-46de-b78a-696094af5561")
=======
    @objid ("e488dec4-6b64-41e6-8e76-41a54fb63ce4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c29a510b-9b94-4718-afc9-8f5b1a41711f")
=======
    @objid ("10ee2385-4779-4564-b68b-ef11a3de8f6b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("852208eb-7533-4bdf-a23d-a1e800264ff2")
=======
    @objid ("38d0aca8-90ad-429f-8581-477a4890bfe9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b9bc8515-3074-4ad3-bf77-f9ac74426fcd")
=======
    @objid ("943876a1-5e20-4c0a-a54b-ff9a0b17e74f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("4124a708-eed6-43c2-8574-c67d75ea799d")
=======
    @objid ("1f8fda96-c29f-44b8-a659-546e7824a3b8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected GeographicalRegion(final Enumeration elt) {
        super(elt);
    }

    @objid ("99a544e5-32ff-4e49-b598-8e15beae3213")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("d787f2cd-b070-4b54-bce0-c3b0ebdbd8a2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3c9effa1-f149-49fb-9d87-6676de0fc8a0")
        private static Stereotype MDAASSOCDEP;

        @objid ("a8648c2c-d90c-4953-81bf-48b773ec8369")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("33f41f7e-bb8d-47d2-a2a8-29dd8fa34cf2")
=======
        @objid ("890fa696-e1d2-48f8-b050-142db3ec74bb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d7e24f45-06f1-4353-8f17-361de731530b")
        private static Stereotype MDAASSOCDEP;

        @objid ("0132a253-38c2-47d3-934e-0baa013a27df")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0cd0cd53-4add-4a2d-bb77-22a21818b81e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
